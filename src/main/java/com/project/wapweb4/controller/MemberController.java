package com.project.wapweb4.controller;

import com.project.wapweb4.domain.Member;
import com.project.wapweb4.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    @GetMapping("/sign-up")
    public String signUp(){
        return "sign-up/signUpForm";
    }

    @PostMapping(value = "/sign-up")
    public String create(MemberForm form){
        long i = 0;
        Member member = new Member();
        member.setUserNo(i++);
        member.setId(form.getId());
        member.setPassword(form.getPassword());
        member.setEmail(form.getEmail());
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/sign-in/index";
    }

}
