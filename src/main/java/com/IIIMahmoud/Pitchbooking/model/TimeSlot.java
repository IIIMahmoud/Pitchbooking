package com.IIIMahmoud.Pitchbooking.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="timeslots")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TimeSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pitch_id", nullable = false)
    private Pitch pitch;

    @Column(name="slot_date", nullable=false)
    private LocalDate slot_date;

    @Column(name= "start_time", nullable=false)
    private LocalTime start_time;

    @Column(name="end_time", nullable=false)
    private LocalTime end_time;

    @Column(name = "is_booked", nullable = false)
    private boolean isBooked = false;


}
