package com.taewan.login.service;

import com.taewan.login.dto.MemberFullInfoDtos;

public interface SearchMemberService {

    MemberFullInfoDtos searchAllMember(int pageNumber);
}
