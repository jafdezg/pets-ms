package com.jafernandezg.pets.services;

import com.jafernandezg.pets.dao.PetDAO;
import com.jafernandezg.pets.entity.Pet;
import com.jafernandezg.pets.services.impl.PetServiceImpl;
import com.jafernandezg.pets_ms.dto.PetDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

class PetServiceTests {

	private PetDAO petDAOMock;

	private PetService petService;

	@BeforeEach
	public void setUp() {
		this.petDAOMock = mock(PetDAO.class);

		this.petService = new PetServiceImpl(this.petDAOMock);
	}

	@Test
	public void getAPet_returnPetDto_whenAllIsOk() {

		// given
		final Pet pet = new Pet();
		pet.setId(1L);
		pet.setName("Toby");

		given(this.petDAOMock.findById(anyLong())).willReturn(Optional.of(pet));

		// when
		final PetDto petDto = this.petService.getAPet(1L);

		// then
		Assertions.assertNotNull(petDto);
		Assertions.assertEquals(1L, petDto.getId());
		Assertions.assertEquals("Toby", petDto.getName());

	}

}
