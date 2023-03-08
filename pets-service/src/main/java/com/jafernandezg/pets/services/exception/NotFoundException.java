package com.jafernandezg.pets.services.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends PetException {

    public NotFoundException(String code, String message) {
        super(HttpStatus.NOT_FOUND.value(), code, message);
    }

    public NotFoundException(String code, Throwable throwable) {
        super(HttpStatus.NOT_FOUND.value(), code, throwable);
    }

}
