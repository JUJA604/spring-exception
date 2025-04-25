package com.project.exception.service;

import com.project.exception.domain.Member;
import com.project.exception.exception.exception.InvalidPasswordException;
import com.project.exception.exception.exception.MemberNotFoundException;
import com.project.exception.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final MemberRepository memberRepository;

    public void login(Member member) {
        // 1. 사용자가 입력한 loginId와 일치하는 회원 존재 여부 검사
        Member findMember = memberRepository.findByLoginId(member.getLoginId())
                            .orElseThrow(MemberNotFoundException::new);

        // 2. 비밀번호 체크
        if (!findMember.getPassword().equals(member.getPassword())) {
            throw new InvalidPasswordException();
        }
    }
}
