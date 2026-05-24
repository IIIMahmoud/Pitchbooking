package com.IIIMahmoud.Pitchbooking.repository;

import com.IIIMahmoud.Pitchbooking.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

}