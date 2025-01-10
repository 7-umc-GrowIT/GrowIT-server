package com.example.GrowIT.repository;

import com.example.GrowIT.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>  {
}
