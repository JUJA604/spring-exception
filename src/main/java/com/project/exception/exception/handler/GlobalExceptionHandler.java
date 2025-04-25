package com.project.exception.exception.handler;

import com.project.exception.exception.dto.ErrorResponse;
import com.project.exception.exception.enums.ErrorCode;
import com.project.exception.exception.exception.FileReadException;
import com.project.exception.exception.exception.InvalidPasswordException;
import com.project.exception.exception.exception.MemberNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private ResponseEntity<ErrorResponse> globalHandle(ErrorCode errorCode) {
        return ResponseEntity.status(errorCode.getStatus())
                .body(ErrorResponse.of(errorCode));
    }

    @ExceptionHandler(FileReadException.class)
    public ResponseEntity<ErrorResponse> handle(FileReadException e) {
        return globalHandle(e.getErrorCode());
    }

    @ExceptionHandler(InvalidPasswordException.class)
    public ResponseEntity<ErrorResponse> handle(InvalidPasswordException e) {
        return globalHandle(e.getErrorCode());
    }

    @ExceptionHandler(MemberNotFoundException.class)
    public ResponseEntity<ErrorResponse> handle(MemberNotFoundException e) {
        return globalHandle(e.getErrorCode());
    }
}

