package com.example.GrowIT.service;

import com.example.GrowIT.dto.TermRequestDTO;
import com.example.GrowIT.dto.TermResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TermCommandService {
    List<TermResponseDTO.TermDTO> getTerms();
    void createUserTerms(List<TermRequestDTO.UserTermDTO> userTermDTO);
}
