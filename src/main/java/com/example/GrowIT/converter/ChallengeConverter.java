package com.example.GrowIT.converter;

import com.example.GrowIT.domain.Challenge;
import com.example.GrowIT.web.dto.ChallengeResponseDTO;
import com.example.GrowIT.web.dto.ChallengeRequestDTO;

import java.time.LocalDateTime;

public class ChallengeConverter {
    public static ChallengeResponseDTO.ChallengeResultDto toChallengeResultDTO(Challenge challenge){
        return ChallengeResponseDTO.ChallengeResultDto.builder()
                .challengeId(challenge.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Challenge toChallengeDTO(ChallengeRequestDTO.ChallengeDto request, Challenge challenge){
        return Challenge.builder()
                .user(user)
                .challenge(challenge)


    }
}
