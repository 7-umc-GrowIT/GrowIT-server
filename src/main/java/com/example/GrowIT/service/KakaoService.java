package com.example.GrowIT.service;

import com.example.GrowIT.dto.KakaoResponseDTO;

public interface KakaoService {

    KakaoResponseDTO.KakaoTokenDTO getToken(String code);

}
