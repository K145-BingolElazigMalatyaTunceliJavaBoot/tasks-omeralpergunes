package com.omergunes.todolist.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UncheckedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UncheckedException(String message) {
        super(message);
    }
}
