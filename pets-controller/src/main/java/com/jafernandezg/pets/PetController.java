package com.jafernandezg.pets;

import com.jafernandezg.pets.services.PetService;
import com.jafernandezg.pets_ms.controllers.PetsApi;
import com.jafernandezg.pets_ms.dto.PetDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
public class PetController implements PetsApi {

    private final PetService petService;

    @Override
    public ResponseEntity<List<PetDto>> getAllPets() {

        log.info("START pets-ms - PetController - getAllPets");

        List<PetDto> petDtoList = this.petService.getAllPets();

        log.info(String.format("RESPONSE pets-ms - PetController - getAllPets --> %s ", petDtoList.toString()));
        log.info("END pets-ms - PetController - getAllPets");

        return ResponseEntity.ok(petDtoList);
    }

    @Override
    public ResponseEntity<PetDto> getAPet(Long id) {

        log.info("START pets-ms - PetController - getAPet");
        log.info(String.format("params --> id: %s ", id));

        PetDto petDto = this.petService.getAPet(id);

        log.info(String.format("RESPONSE pets-ms - PetController - getAPet --> %s ", petDto.toString()));
        log.info("END pets-ms - PetController - getAPet");
        return ResponseEntity.ok(petDto);
    }

}
