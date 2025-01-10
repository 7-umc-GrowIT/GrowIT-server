package com.example.GrowIT.web.dto;


import com.example.GrowIT.validation.annotation.ExistChallenge;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;

public class ChallengeRequestDTO {
    @Getter
    public static class ChallengeProveDto {
        @NotEmpty(message = "인증샷 업로드하기")
        String thoughts;
        @NotEmpty(message = "챌린지 소감을 간단하게 입력해 주세요")
        String certification_image;
        @ExistChallenge
        Long challengeId;
    }

}
