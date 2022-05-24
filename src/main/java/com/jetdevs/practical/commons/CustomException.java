package com.jetdevs.practical.commons;

import lombok.Data;

@Data
public class CustomException extends Exception{
    int errorCode;
    private static final long serialVersionUID = 1L;

    public CustomException() {
        super();
    }

    public CustomException(String message) {
        super(message);
    }


    public CustomException(Exception e) {
        super(e);
    }

    public CustomException(String message, Exception e) {
        super(message, e);
    }

    public CustomException(int errorCode, Exception e) {
        super(e);
    }

    public CustomException(int errCode, String message, Exception e) {
        super(message, e);

        this.errorCode = errCode;
    }

    public CustomException(int errCode, String message) {
        super(message);

        this.errorCode = errCode;
    }
}
