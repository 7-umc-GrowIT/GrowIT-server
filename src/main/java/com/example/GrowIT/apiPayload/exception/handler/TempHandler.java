package com.example.GrowIT.apiPayload.exception.handler;


import com.example.GrowIT.apiPayload.code.BaseErrorCode;
import com.example.GrowIT.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}