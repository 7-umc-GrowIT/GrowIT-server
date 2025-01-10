package com.example.GrowIT.controller.specification;

import com.example.GrowIT.api.ApiResponse;
import com.example.GrowIT.dto.TermResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface TermSpecification {

    @GetMapping("/terms")
    @Operation(summary = "약관 목록 조회", description = "")
    @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "COMMON200", description = "⭕ SUCCESS")
    ApiResponse<List<TermResponseDTO.TermDTO>> getTerms();
}
