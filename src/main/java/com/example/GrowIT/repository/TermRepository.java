package com.example.GrowIT.repository;

import com.example.GrowIT.domain.Term;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TermRepository extends JpaRepository<Term, Long> {
}
