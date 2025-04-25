package com.project.exception.config;

import com.project.exception.domain.Member;
import com.project.exception.repository.MemberRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberInit {
    private final MemberRepository memberRepository;

    @PostConstruct
    public void memberInit() {
        Member member = Member.builder()
                        .loginId("test")
                        .password("test")
                        .build();

        memberRepository.save(member);
    }
}
