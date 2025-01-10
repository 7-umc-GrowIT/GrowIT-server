package com.example.GrowIT.service;

import com.example.GrowIT.dto.UserRequestDTO;
import com.example.GrowIT.dto.UserResponseDTO;

public interface UserCommandService {

    UserResponseDTO.TokenDTO createUser(UserRequestDTO.UserInfoDTO userInfoDTO);

    UserResponseDTO.TokenDTO emailLogin(UserRequestDTO.EmailLoginDTO emailLoginDTO);

    void updatePassword(UserRequestDTO.PasswordDTO passwordDTO);
}
