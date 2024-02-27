package com.taewan.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "Members")
public class Member {

    @Id @GeneratedValue
    private Long idx;
    private String id;
    private String password;
    private String nickName;
    private String name;
    private String phoneNumber;
    private String email;
    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime lastModifiedAt;
    private LocalDateTime lastActedAt;
}
