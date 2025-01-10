package com.example.GrowIT.controller;

import com.example.GrowIT.api.ApiResponse;
import com.example.GrowIT.api.handler.TestHandler;
import com.example.GrowIT.api.status.ErrorStatus;
import com.example.GrowIT.controller.specification.UserSpecification;
import com.example.GrowIT.service.UserCommandService;
import com.example.GrowIT.domain.User;
import com.example.GrowIT.dto.UserRequestDTO;
import com.example.GrowIT.dto.UserResponseDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController implements UserSpecification {

    private final UserCommandService userCommandService;

    @PostMapping("/login/email")
    public ApiResponse<UserResponseDTO.TokenDTO> loginEmail(@RequestBody @Valid UserRequestDTO.EmailLoginDTO emailLoginDTO) {
        UserResponseDTO.TokenDTO token = userCommandService.emailLogin(emailLoginDTO);
        if (token == null) {
            return ApiResponse.fail(ErrorStatus.USER_NOT_FOUND.getCode(), ErrorStatus.USER_NOT_FOUND.getMessage(), null);
        }
        return ApiResponse.success(token);
    }

    @PostMapping("/users")
    public ApiResponse<UserResponseDTO.TokenDTO> createUser(@RequestBody @Valid UserRequestDTO.UserInfoDTO userInfoDTO) {
        UserResponseDTO.TokenDTO token = userCommandService.createUser(userInfoDTO);
        return ApiResponse.success(token);
    }

    @PatchMapping("/users/password/find")
    public ApiResponse<Void> findPassword(@RequestBody @Valid UserRequestDTO.PasswordDTO passwordDTO) {
        userCommandService.updatePassword(passwordDTO);
        return ApiResponse.success();
    }

    @PostMapping("/test")
    public User test() {
        throw new TestHandler(ErrorStatus.USER_NOT_FOUND);
    }

}
