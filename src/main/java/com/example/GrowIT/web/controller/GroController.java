package com.example.GrowIT.web.controller;

import com.example.GrowIT.web.dto.GroDTO.GroRequestDTO;
import com.example.GrowIT.web.dto.GroDTO.GroResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import com.example.GrowIT.apiPayload.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Gro", description = "Gro 관련 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/characters")
public class GroController {

//    private final GroService groService;

    @PostMapping("")
    @Operation(summary = "그로 캐릭터 생성", description = "사용자의 그로 캐릭터를 생성합니다.")
    @ApiResponses({
            @io.swagger.v3.oas.annotations.responses.ApiResponse(
                    responseCode = "COMMON200",
                    description = "성공"
            ),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "AUTH001",
                    description = "acess 토큰 만료",
                    content = @Content(schema = @Schema(implementation = ApiResponse.class))),
    })


    public ApiResponse<GroResponseDTO> createGro(
            @Parameter(description = "Bearer {kakao_access_token}")
            @RequestHeader("Authorization") String authorization,
            @Valid @RequestBody GroRequestDTO request
    ) {
        // Service를 통해 엔티티 생성
        //Gro gro = groService.createGro(request);
        return ApiResponse.onSuccess(null);
    }
}