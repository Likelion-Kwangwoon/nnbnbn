package com.start.service;

import com.start.entity.Member;
import com.start.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Memberservice {

    @Autowired
    private MemberRepository memberRepository;
    public Member memberGetById(Long id) {
        return memberRepository.findById(id).orElseThrow(()->new RuntimeException("id에 해당하는 멤버가 없습니다."));
    }

    public List<Member> memberAll() {
        return memberRepository.findAll();
    }
}
