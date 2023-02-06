package com.jafernandezg.pets.services;

import com.jafernandezg.pets_ms.dto.PetDto;

import java.util.List;

public interface PetService {

    List<PetDto> getAllPets();

    PetDto getAPet(Long id);

}
