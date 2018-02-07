package com.school.exceptions;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class InvalidParamException extends BaseCustomRuntimeException {
    @Builder
    public InvalidParamException(String detail, String title, String pointer) {
        super(detail, title, pointer, HttpStatus.BAD_REQUEST);
    }
}
