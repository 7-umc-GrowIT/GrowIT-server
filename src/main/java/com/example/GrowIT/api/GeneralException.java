package com.example.GrowIT.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException {

    private BaseErrorCode baseErrorCode;

    public ErrorReasonDTO getErrorReason() {
        return this.baseErrorCode.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus(){
        return this. baseErrorCode.getReasonHttpStatus();
    }
}