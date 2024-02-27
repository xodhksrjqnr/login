package com.taewan.login.service;

import com.taewan.login.DtoConverter;
import com.taewan.login.dao.MemberJpaRepository;
import com.taewan.login.dto.MemberFullInfoDtos;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchMemberServiceImpl implements SearchMemberService {

    private final MemberJpaRepository memberJpaRepository;
    private final int PAGE_SIZE = 50;

    public MemberFullInfoDtos searchAllMember(int pageNumber) {
        return new MemberFullInfoDtos(
                memberJpaRepository
                        .findAll(PageRequest.of(pageNumber, PAGE_SIZE))
                        .map(DtoConverter::entityToFullInfoDto)
                        .toList()
        );
    }
}
