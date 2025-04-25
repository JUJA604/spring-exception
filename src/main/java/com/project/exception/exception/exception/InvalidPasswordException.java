package com.project.exception.exception.exception;

import com.project.exception.exception.enums.ErrorCode;
import lombok.Getter;

@Getter
public class InvalidPasswordException extends RuntimeException {
    private final ErrorCode errorCode;

    public InvalidPasswordException() {
        super(ErrorCode.AUTH_INVALID_PASSWORD.getMessage());
        this.errorCode = ErrorCode.AUTH_INVALID_PASSWORD;
    }
}
