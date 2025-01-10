package com.example.GrowIT.service;

import com.example.GrowIT.dto.UserRequestDTO;
import com.example.GrowIT.dto.UserResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class UserCommandServiceImpl implements UserCommandService {

    @Override
    public UserResponseDTO.TokenDTO createUser(UserRequestDTO.UserInfoDTO userInfoDTO) {
        return null;
    }

    @Override
    public UserResponseDTO.TokenDTO emailLogin(UserRequestDTO.EmailLoginDTO emailLoginDTO){
        return null;
    }

    @Override
    public void updatePassword(UserRequestDTO.PasswordDTO passwordDTO) {

    }
}
