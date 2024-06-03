package com.tuuniversidad.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class RestResponseEntityExceptionHandler {
    @ExceptionHandler(LibroException.class)
    public ResponseEntity<ExceptionResponse> toNotFound(LibroException ex){
        ExceptionResponse response = new ExceptionResponse("Error en Libro","Any details");
        return new ResponseEntity<ExceptionResponse>(response,HttpStatus.NOT_FOUND);
    }
}
