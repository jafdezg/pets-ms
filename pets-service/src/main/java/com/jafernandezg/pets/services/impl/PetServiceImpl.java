package com.jafernandezg.pets.services.impl;

import com.jafernandezg.pets.dao.PetDAO;
import com.jafernandezg.pets.entity.Pet;
import com.jafernandezg.pets.services.PetService;
import com.jafernandezg.pets_ms.dto.PetDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PetServiceImpl implements PetService {

    private final PetDAO petDAO;

    @Override
    public List<PetDto> getAllPets() {
        return null;
    }

    @Override
    public PetDto getAPet(Long id) {

        Optional<Pet> optionalPet = this.petDAO.findById(id);
        Pet pet = optionalPet.get();

        PetDto petDto = new PetDto();

        petDto.setId(pet.getId());
        petDto.setName(pet.getName());

        return petDto;
    }

}

