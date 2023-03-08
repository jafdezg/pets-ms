package com.jafernandezg.pets.services.impl;

import com.jafernandezg.pets.dao.PetDao;
import com.jafernandezg.pets.entity.Pet;
import com.jafernandezg.pets.services.PetService;
import com.jafernandezg.pets.services.dto.ErrorDto;
import com.jafernandezg.pets.services.exception.NotFoundException;
import com.jafernandezg.pets.services.mapper.PetMapper;
import com.jafernandezg.pets_ms.dto.PetDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PetServiceImpl implements PetService {

    private final PetDao petDao;
    private final PetMapper petMapper;

    @Override
    @Transactional(readOnly = true)
    public List<PetDto> getAllPets() {
        List<Pet> petList = this.petDao.findAll();

        List<PetDto> petDtoList = this.petMapper.mapPetEntityListToPetDtoList(petList);

        return petDtoList;
    }

    @Override
    @Transactional(readOnly = true)
    public PetDto getAPet(Long id) {

        Pet pet = this.petDao.findById(id).orElseThrow(() -> new NotFoundException(
                ErrorDto.PET_NOT_FOUND.getCode(),
                String.format(ErrorDto.PET_NOT_FOUND.getDescription(), id)));

        PetDto petDto = this.petMapper.mapPetEntityToPetDto(pet);

        return petDto;
    }

}

