package com.IIIMahmoud.Pitchbooking.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name="pitches")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pitch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="owner_id", nullable=false)
    private User owner;

    @NotBlank(message = "U must enter pitch name")
    @Column(nullable=false, length=100)
    private String name;

    @NotNull(message = "u must enter pitch type")
    @Column(name="pitch_type", nullable=false, length=50)
    private String pitchType;

    @NotBlank(message = "U must enter pitch location") // تم تعديل الرسالة هنا
    @Column(nullable=false, length=100)
    private String location;

    @NotBlank(message = "u must provide a pitch picture")
    @Column(nullable=false)
    private String picture;

    // ضفنا الحقل ده لأنه كان مبعوث في الـ JSON ومش موجود في الكود 👇
    @NotNull(message = "u must enter price per hour")
    @Column(name="price_per_hour", nullable=false)
    private Double pricePerHour;

    @Column(name="time_creation", nullable=false, updatable=false)
    private Instant timeCreation;

    @PrePersist
    protected void onCreate() {
        if (this.timeCreation == null) {
            this.timeCreation = Instant.now();
        }
    }
}