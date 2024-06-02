package bsu.edu.kinopoiskapiclient.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public ResponseEntity<ExceptionDetails> handleException(RuntimeException e) {
        return new ResponseEntity<>(new ExceptionDetails(new Date(), e.toString()), HttpStatus.SERVICE_UNAVAILABLE);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ExceptionDetails> globalExceptionHandler(Exception e) {
        return new ResponseEntity<>(new ExceptionDetails(new Date(), e.toString()), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}


