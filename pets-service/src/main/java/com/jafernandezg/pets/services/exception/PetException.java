package com.jafernandezg.pets.services.exception;

public class PetException extends RuntimeException {

    private int httpCode;
    private String code;
    private String message;

    public PetException(int httpCode, String code, String message) {
        super(message);
        this.httpCode = httpCode;
        this.message = message;
        this.code = code;
    }

    public PetException(int httpCode, String code, Throwable throwable) {
        super(throwable);
        this.httpCode = httpCode;
        this.message = throwable.getMessage();
        this.code = code;
    }

}
