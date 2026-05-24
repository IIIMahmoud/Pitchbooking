package com.IIIMahmoud.Pitchbooking.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data // بتعمل الـ getters والـ setters والـ toString تلقائياً بفضل Lombok
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false)
    private String status = "ACTIVE";

    // الحقل الجديد اللي مسبب المشكلة 👇
    @Column(name = "user_time_creation", nullable = false)
    private LocalDateTime userTimeCreation;

    @PrePersist
    protected void onCreate() {
        if (this.userTimeCreation == null) {
            this.userTimeCreation = LocalDateTime.now();
        }
    }
}