package com.example.GrowIT.service.ChallengeService;

import com.example.GrowIT.converter.ChallengeConverter;
import com.example.GrowIT.domain.Challenge;
import com.example.GrowIT.repository.ChallengeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ChallengeCommandServiceImpl implements ChallengeCommandService {

    private final ChallengeRepository challengeRepository;

    @Override
    @Transactional
    public Challenge proveChallenge(ChallengeRequestDTO.ChallengeProveDto request) {

        Challenge newChallenge = ChallengeConverter.toChallengeDTO(request);
    }
}
