package com.taewan.login;

import com.taewan.login.dto.MemberFullInfoDto;
import com.taewan.login.entity.Member;

public class DtoConverter {

    public static MemberFullInfoDto entityToFullInfoDto(Member member) {
        return MemberFullInfoDto.builder()
                .idx(member.getIdx())
                .id(member.getId())
                .password(member.getPassword())
                .name(member.getName())
                .nickName(member.getNickName())
                .email(member.getEmail())
                .phoneNumber(member.getPhoneNumber())
                .createdAt(member.getCreatedAt())
                .lastModifiedAt(member.getLastModifiedAt())
                .lastActedAt(member.getLastActedAt())
                .build();
    }
}
