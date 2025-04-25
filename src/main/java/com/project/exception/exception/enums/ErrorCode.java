package com.project.exception.exception.enums;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {
    AUTH_MEMBER_NOT_FOUND("AUTH_MEMBER_NOT_FOUND", HttpStatus.NOT_FOUND, "회원이 존재하지 않습니다."),
    AUTH_INVALID_PASSWORD("AUTH_INVALID_PASSWORD", HttpStatus.UNAUTHORIZED, "비밀번호가 일치하지 않습니다."),
    FILE_READ_ERROR("FILE_READ_ERROR", HttpStatus.INTERNAL_SERVER_ERROR, "파일을 읽는 도중 문제가 발생했습니다.");

    private final String code;
    private final HttpStatus status;
    private final String message;

    ErrorCode(String code, HttpStatus status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }
}
