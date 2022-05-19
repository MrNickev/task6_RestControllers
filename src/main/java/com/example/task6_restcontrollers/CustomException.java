package com.example.task6_restcontrollers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {HttpServerErrorException.InternalServerError.class, NullPointerException.class})
    public ResponseEntity<Object> handle(RuntimeException ex, WebRequest request) {
        return new ResponseEntity("Get incorrect data", HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
