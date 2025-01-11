package com.example.GrowIT.web.dto.ItemDTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

public class ItemResponseDTO {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ItemListDTO {
        @Schema(description = "아이템 목록")
        private List<ItemDTO> itemList;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ItemDTO {
        @Schema(description = "아이템 ID")
        Long id;

        @Schema(description = "아이템명")
        String name;

        @Schema(description = "아이템 가격 (크레딧)", example = "120")
        Integer price;

        @Schema(description = "이미지 URL")
        String imageUrl;

        @Schema(description = "아이템 카테고리")
        String category;

        @Schema(description = "착용 상태", example = "EQUIPPED", allowableValues = {"EQUIPPED", "UNEQUIPPED"})
        String status;
    }
}
