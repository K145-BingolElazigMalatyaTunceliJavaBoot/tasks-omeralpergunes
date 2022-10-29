package com.omergunes.todolist.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExceptionHandling extends RuntimeException {

    public ExceptionHandling(String message) {
        super(message);
    }
}
