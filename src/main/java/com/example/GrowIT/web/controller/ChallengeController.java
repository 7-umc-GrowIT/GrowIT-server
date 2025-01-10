package com.example.GrowIT.web.controller;

import com.example.GrowIT.converter.ChallengeConverter;
import com.example.GrowIT.domain.Challenge;
import com.example.GrowIT.service.ChallengeService.ChallengeCommandService;
import com.example.GrowIT.validation.annotation.ExistChallenge;
import com.example.GrowIT.validation.annotation.ExistUser;
import com.example.GrowIT.web.dto.ChallengeResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import com.example.GrowIT.apiPayload.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Challenge", description = "챌린지 관련 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/challenges")
public class ChallengeController {

    private final ChallengeCommandService challengeCommandService;

    @PostMapping("/{challengeId}/prove")
    @Operation(summary = "챌린지 인증 작성 API")
    public ApiResponse<ChallengeResponseDTO.ChallengeResultDto> createChallenge(@RequestBody @Valid ChallengeRequestDTO.ChallengeDTO request,
                                                                                @ExistChallenge @PathVariable(name = "challengeId") Long challengeId,
                                                                                @ExistUser @RequestParam(name = "userId") Long userId) {
        Challenge challenge = challengeCommandService.createChallenge(userId, challengeId, request);
        return ApiResponse.onSuccess(ChallengeConverter.ChallengeResultDto(challenge));
    }

//    @PatchMapping("/{challengeId}")
//    @Operation(summary = "챌린지 인증 수정 API")
//    public ApiResponse<ChallengeResponseDTO.>



}
