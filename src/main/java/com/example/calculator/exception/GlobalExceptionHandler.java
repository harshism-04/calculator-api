package com.example.calculator.exception;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.example.calculator.dto.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DivisionByZeroException.class)
    public ResponseEntity<ErrorResponse> handleDivisionByZero(DivisionByZeroException ex)
    {
        ErrorResponse errorResponse = new ErrorResponse(400,"Bad Request",ex.getMessage());
        return ResponseEntity
                .badRequest()
                .body(errorResponse);
    }
}
