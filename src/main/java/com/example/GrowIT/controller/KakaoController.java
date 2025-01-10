package com.example.GrowIT.controller;

import com.example.GrowIT.api.ApiResponse;
import com.example.GrowIT.controller.specification.KakaoSpecification;
import com.example.GrowIT.service.KakaoService;
import com.example.GrowIT.dto.KakaoResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KakaoController implements KakaoSpecification {

    private final KakaoService kakaoService;

    @GetMapping("/login/kakao")
    public ApiResponse<KakaoResponseDTO.KakaoTokenDTO> kakaoLogin(@RequestParam(value = "code", required = false) String code) {
        KakaoResponseDTO.KakaoTokenDTO token = kakaoService.getToken(code);
        return ApiResponse.success(token);
    }
}
