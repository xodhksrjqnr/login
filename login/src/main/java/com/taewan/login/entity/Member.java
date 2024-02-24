package com.taewan.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
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
    private LocalDateTime createdDateTime;
    @LastModifiedDate
    private LocalDateTime lastModifiedDateTime;
    private LocalDateTime lastActedDataTime;
}
