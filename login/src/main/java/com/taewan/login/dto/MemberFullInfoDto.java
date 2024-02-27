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
    private LocalDateTime createdDateTime;
    private LocalDateTime lastModifiedDateTime;
    private LocalDateTime lastActedDataTime;

    @Builder
    public MemberFullInfoDto(Long idx, String id, String password, String nickName, String name, String phoneNumber, String email, LocalDateTime createdDateTime, LocalDateTime lastModifiedDateTime, LocalDateTime lastActedDataTime) {
        this.idx = idx;
        this.id = id;
        this.password = password;
        this.nickName = nickName;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.createdDateTime = createdDateTime;
        this.lastModifiedDateTime = lastModifiedDateTime;
        this.lastActedDataTime = lastActedDataTime;
    }
}
