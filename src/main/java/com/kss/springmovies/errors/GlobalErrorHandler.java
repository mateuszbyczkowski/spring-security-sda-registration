package com.kss.springmovies.errors;

import com.kss.springmovies.repository.EntityExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalErrorHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> handleGeneralError(Exception e){

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new ErrorDto(e.getMessage()));
    }

    @ExceptionHandler(value = EntityExistsException.class)
    public ResponseEntity<Object> handleEntityExists(EntityExistsException e){

        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(new ErrorDto(e.getMessage()));
    }

}
