package com.example.GrowIT.validation.validator;

import com.example.GrowIT.apiPayload.code.status.ErrorStatus;
import com.example.GrowIT.repository.ChallengeRepository;
import com.example.GrowIT.validation.annotation.ExistChallenge;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ChallengeExistsValidator implements ConstraintValidator<ExistChallenge, List<Long>> {

    private final ChallengeRepository challengeRepository;

    @Override
    public void initialize(ExistChallenge constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(List<Long> values, ConstraintValidatorContext context) {
        boolean isValid = values.stream()
                .allMatch(value -> challengeRepository.existsById(value));

        if (!isValid) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(ErrorStatus.CHALLENGE_NOT_FOUND.toString()).addConstraintViolation();
        }

        return isValid;

    }

}
