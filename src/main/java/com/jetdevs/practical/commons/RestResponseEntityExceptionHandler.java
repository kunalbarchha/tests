package com.jetdevs.practical.commons;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class RestResponseEntityExceptionHandler {

    @ExceptionHandler(CustomException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public AppResponse<Object> handleNotFoundException(CustomException ex) {
        AppResponse<Object> bodyOfResponse = new AppResponse<>();
        bodyOfResponse.setStatusCode(ex.getErrorCode());
        bodyOfResponse.setStatusMsg(ex.getMessage());

        return bodyOfResponse;
    }
}
