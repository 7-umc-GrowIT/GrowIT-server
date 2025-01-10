package com.example.GrowIT.service.ChallengeService;

import com.example.GrowIT.domain.Challenge;

import java.util.Optional;

public interface ChallengeQueryService {
    Optional<Challenge> searchChallenge(Long id);
}
