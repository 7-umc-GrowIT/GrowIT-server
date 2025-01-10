package com.example.GrowIT.service.ChallengeService;

import com.example.GrowIT.domain.Challenge;
import com.example.GrowIT.repository.ChallengeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ChallengeQueryServiceImpl implements ChallengeQueryService{

    private final ChallengeRepository challengeRepository;

    @Override
    public Optional<Challenge> searchChallenge(Long id) {
        return challengeRepository.findById(id);
    }

}
