package com.example.GrowIT.apiPayload.exception.handler;

public enum ErrorStatus {
    FOOD_CATEGORY_NOT_FOUND("E001", "Food category not found"),
    MEMBER_NOT_FOUND("E002", "Member not found"),
    PAGE_LAW_NUMBER("E003", "TOO LAW PAGE NUMBER");

    private final String code;
    private final String message;

    ErrorStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
