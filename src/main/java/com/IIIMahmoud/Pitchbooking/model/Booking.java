package com.IIIMahmoud.Pitchbooking.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name="bookings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private double price;

    @Column( name="booking_time_creation",nullable=false,updatable=false)
    private Instant timeCreation= Instant.now();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id", nullable = false)
    private User player;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "timeslot_id", nullable = false, unique = true)
    private TimeSlot timeSlot;

}
