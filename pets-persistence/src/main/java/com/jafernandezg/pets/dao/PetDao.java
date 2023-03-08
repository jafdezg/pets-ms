package com.jafernandezg.pets.dao;

import com.jafernandezg.pets.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetDao extends JpaRepository<Pet, Long> {

}
