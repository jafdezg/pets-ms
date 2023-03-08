package com.jafernandezg.pets.services.mapper;

import com.jafernandezg.pets.entity.Pet;
import com.jafernandezg.pets_ms.dto.PetDto;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Named("PetMapper")
@Mapper
public interface PetMapper {

    PetDto mapPetEntityToPetDto(Pet pet);

    List<PetDto> mapPetEntityListToPetDtoList(List<Pet> petList);

}
