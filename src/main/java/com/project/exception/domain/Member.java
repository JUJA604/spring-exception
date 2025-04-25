package com.project.exception.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Member {
    private String loginId;
    private String password;

    @Builder
    public Member(String loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }
}
