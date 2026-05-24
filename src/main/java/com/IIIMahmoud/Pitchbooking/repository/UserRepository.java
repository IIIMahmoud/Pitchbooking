package com.IIIMahmoud.Pitchbooking.repository;

import com.IIIMahmoud.Pitchbooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}