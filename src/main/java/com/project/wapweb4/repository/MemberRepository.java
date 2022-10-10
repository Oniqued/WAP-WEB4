package com.project.wapweb4.repository;

import com.project.wapweb4.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);
    Optional<Member> findByUserNo(Long userNo);
    Optional<Member> findById(String id);
    Optional<Member> findByName(String password);
    Optional<Member> findByPassword(String name);
    Optional<Member> findByEmail(String email);

    List<Member> findAll();
}
