package com.jafernandezg.pets.dao;

import com.jafernandezg.pets.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PetDAO extends JpaRepository<Pet, Long>, JpaSpecificationExecutor<Pet> {

}
