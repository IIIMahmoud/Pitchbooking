package com.IIIMahmoud.Pitchbooking.repository;

import com.IIIMahmoud.Pitchbooking.model.Pitch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PitchRepository extends JpaRepository<Pitch, Long> {
}