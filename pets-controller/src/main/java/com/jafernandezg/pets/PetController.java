package com.jafernandezg.pets;

import com.jafernandezg.pets_ms.controllers.PetsApi;
import com.jafernandezg.pets_ms.dto.PetDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RestController
public class PetController implements PetsApi {

    @Override
    public ResponseEntity<List<PetDto>> getAllPets() {
        PetDto petDto = new PetDto();
        petDto.setId(BigDecimal.ONE);
        petDto.setName("Toby");

        PetDto petDto2 = new PetDto();
        petDto2.setId(BigDecimal.valueOf(2L));
        petDto2.setName("Pinchitos");

        return ResponseEntity.ok(Arrays.asList(petDto, petDto2));
    }

    @Override
    public ResponseEntity<PetDto> getAPet(BigDecimal id) {
        PetDto petDto = new PetDto();

        petDto.setId(BigDecimal.ONE);
        petDto.setName("Toby");

        return ResponseEntity.ok(petDto);
    }

}
