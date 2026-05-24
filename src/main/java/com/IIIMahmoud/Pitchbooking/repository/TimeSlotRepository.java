package com.IIIMahmoud.Pitchbooking.repository;

import com.IIIMahmoud.Pitchbooking.model.TimeSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeSlotRepository extends JpaRepository<TimeSlot, Long> {


}