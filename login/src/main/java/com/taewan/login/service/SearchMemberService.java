package com.taewan.login.service;

import com.taewan.login.dto.MemberFullInfoDtos;

import java.util.List;

public interface SearchMemberService {

    MemberFullInfoDtos searchAllMember(int pageNumber);
}
