package com.taewan.login.dto;

import lombok.Builder;

import java.time.LocalDateTime;

public class MemberFullInfoDto {

    private Long idx;
    private String id;
    private String password;
    private String nickName;
    private String name;
    private String phoneNumber;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
    private LocalDateTime lastActedAt;

    @Builder
    public MemberFullInfoDto(Long idx, String id, String password, String nickName, String name, String phoneNumber, String email, LocalDateTime createdAt, LocalDateTime lastModifiedAt, LocalDateTime lastActedAt) {
        this.idx = idx;
        this.id = id;
        this.password = password;
        this.nickName = nickName;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastActedAt = lastActedAt;
    }
}
