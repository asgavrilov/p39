package com.peer39.exceptions;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Log4j2
public class GlobalExceptionsHandler {

    @ExceptionHandler
    @ResponseStatus
    String getResponseRuntime(Exception e) {
        return exceptionResponse(e);
    }

    private String exceptionResponse(Exception e) {
        log.error(e.toString());
        return e.getMessage();
    }
}
