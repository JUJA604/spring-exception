package com.project.exception.exception.exception;

import com.project.exception.exception.enums.ErrorCode;
import lombok.Getter;

@Getter
public class FileReadException extends RuntimeException {
    private final ErrorCode errorCode;

    public FileReadException(Throwable cause) {
        super(ErrorCode.FILE_READ_ERROR.getMessage(), cause);
        this.errorCode = ErrorCode.FILE_READ_ERROR;
    }
}