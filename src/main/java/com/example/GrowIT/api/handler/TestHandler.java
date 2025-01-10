package com.example.GrowIT.api.handler;

import com.example.GrowIT.api.BaseErrorCode;
import com.example.GrowIT.api.GeneralException;

public class TestHandler extends GeneralException {

    public TestHandler(BaseErrorCode baseErrorCode) {
        super(baseErrorCode);
    }
}
