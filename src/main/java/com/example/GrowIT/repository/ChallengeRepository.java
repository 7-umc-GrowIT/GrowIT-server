package com.example.GrowIT.repository;

import com.example.GrowIT.domain.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChallengeRepository extends JpaRepository<Challenge, Long> {
}
