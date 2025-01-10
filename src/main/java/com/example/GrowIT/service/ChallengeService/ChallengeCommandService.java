package com.example.GrowIT.service.ChallengeService;

import com.example.GrowIT.domain.Challenge;
import com.example.GrowIT.web.dto.ChallengeRequestDTO;
public interface ChallengeCommandService {
    Challenge proveChallenge(ChallengeRequestDTO.ChallengeProveDto request);
}
