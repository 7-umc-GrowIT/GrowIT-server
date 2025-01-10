package com.example.GrowIT.controller;

import com.example.GrowIT.api.ApiResponse;
import com.example.GrowIT.controller.specification.TermSpecification;
import com.example.GrowIT.service.TermCommandService;
import com.example.GrowIT.dto.TermResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TermController implements TermSpecification {

    private final TermCommandService termCommandService;

    @GetMapping("/terms")
    public ApiResponse<List<TermResponseDTO.TermDTO>> getTerms() {
        return ApiResponse.success(termCommandService.getTerms());
    }

}
