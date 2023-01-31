package com.jafernandezg.pets;

import com.jafernandezg.pets_ms.controllers.PetsApi;
import com.jafernandezg.pets_ms.dto.PetDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetsController implements PetsApi {

    @Override
    public ResponseEntity<PetDto> getAllPets() {
        System.out.println("Hola: ####");
        return ResponseEntity.ok().build();
    }

}
