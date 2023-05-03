package com.example.user_oauth2_study.repository;

import com.example.user_oauth2_study.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, Long> {
}
