package com.example.GrowIT.web.controller;

import com.example.GrowIT.apiPayload.ApiResponse;
import com.example.GrowIT.domain.enums.ItemCategory;
import com.example.GrowIT.web.dto.ItemDTO.ItemResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Tag(name="Item", description = "아이템 관련 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/items")
public class ItemController {

    @GetMapping("")
    public ApiResponse<ItemResponseDTO.ItemListDTO> getItemListByCategory(
            @Schema(description = "아이템 카테고리 (카테고리 명으로 전달)",
                    allowableValues = {"BACKGROUND", "OBJECT", "PLANT", "HEAD_ACCESSORY"},
                    example = "BACKGROUND")
            @RequestParam ItemCategory category)
    {
        return ApiResponse.onSuccess(null);
    }





}
