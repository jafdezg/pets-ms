package com.jafernandezg.pets.services.dto;

import lombok.Getter;

@Getter
public enum ErrorDto {
    PET_NOT_FOUND("ERROR-001", "The pet %s was not found.");

    private final String code;
    private final String description;

    ErrorDto(String code, String description) {
        this.code = code;
        this.description = description;
    }

}
