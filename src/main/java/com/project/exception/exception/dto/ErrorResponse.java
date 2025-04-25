package com.project.exception.exception.dto;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
public class ErrorResponse {
    private final int status;
    private final String errorCode;
    private final String message;
    private final LocalDateTime timestamp;

    public static ErrorResponse of(HttpStatus status, String errorCode, String message) {
        return new ErrorResponse(status.value(), errorCode, message, LocalDateTime.now());
    }

    @Builder
    public ErrorResponse(int status, String errorCode, String message, LocalDateTime timestamp) {
        this.status = status;
        this.errorCode = errorCode;
        this.message = message;
        this.timestamp = timestamp;
    }
}
