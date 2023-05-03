package com.example.user_oauth2_study.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Data
public class Account {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountId; // 아이디
    private String accountName; // 이름
    private String password; // 비밀번호
    private String email; // 이메일
    private String role; // 권한
    private Date birth; // 생년월일
    @CreationTimestamp
    private Timestamp createDate; // 가입날짜
}
