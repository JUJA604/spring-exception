package com.project.exception.exception.exception;

import com.project.exception.exception.enums.ErrorCode;
import lombok.Getter;

@Getter
public class MemberNotFoundException extends RuntimeException {
    private final ErrorCode errorCode;

    public MemberNotFoundException() {
        super(ErrorCode.AUTH_MEMBER_NOT_FOUND.getMessage());
        this.errorCode = ErrorCode.AUTH_MEMBER_NOT_FOUND;
    }
}
