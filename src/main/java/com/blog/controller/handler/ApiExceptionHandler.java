package com.blog.controller.handler;

import com.blog.exception.BlogEntityNotFoundException;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Log4j2
public class ApiExceptionHandler {

    @ExceptionHandler(BlogEntityNotFoundException.class)
    public ResponseEntity<Void> handleEntityNotFound(Exception exception) {
        log.error(exception.getMessage(), exception);
        return ResponseEntity.noContent().build();
    }
}
