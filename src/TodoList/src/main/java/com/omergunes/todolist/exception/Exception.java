package com.omergunes.todolist.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Exception {
    @ExceptionHandler(UncheckedException.class)
    public String responseMessage(UncheckedException exception) {
        return exception.getMessage();
    }
}
