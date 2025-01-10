package com.example.GrowIT.controller.specification;

import com.example.GrowIT.api.ApiResponse;
import com.example.GrowIT.dto.KakaoResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface KakaoSpecification {

    @GetMapping("/login/kakao")
    @Operation(summary = "카카오 소셜 로그인", description = "")
    @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "COMMON200", description = "⭕ SUCCESS")
    ApiResponse<KakaoResponseDTO.KakaoTokenDTO> kakaoLogin(@RequestParam(value = "code", required = false) String code);
}
