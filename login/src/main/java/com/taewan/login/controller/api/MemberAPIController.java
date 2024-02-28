package com.taewan.login.controller;

import com.taewan.login.dto.MemberFullInfoDtos;
import com.taewan.login.service.SearchMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/members")
public class MemberAPIController {

    private final SearchMemberService memberService;

    @GetMapping
    public MemberFullInfoDtos askForAllMembers(@RequestParam(name = "pageNumber", required = false, defaultValue = "0") int pageNumber) {
        return memberService.searchAllMember(pageNumber);
    }
}
