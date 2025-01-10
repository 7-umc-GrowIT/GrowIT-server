package com.example.GrowIT.service;

import com.example.GrowIT.dto.TermRequestDTO;
import com.example.GrowIT.dto.TermResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TermCommandServiceImpl implements TermCommandService {
    @Override
    public List<TermResponseDTO.TermDTO> getTerms() {
        return null;
    }

    @Override
    public void createUserTerms(List<TermRequestDTO.UserTermDTO> userTermDTO) {

    }
}
