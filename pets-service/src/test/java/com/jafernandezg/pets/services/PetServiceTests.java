package com.jafernandezg.pets.services;

import com.jafernandezg.pets.dao.PetDao;
import com.jafernandezg.pets.entity.Pet;
import com.jafernandezg.pets.services.impl.PetServiceImpl;
import com.jafernandezg.pets.services.mapper.PetMapper;
import com.jafernandezg.pets_ms.dto.PetDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

class PetServiceTests {

	private PetDao petDaoMock;
	private PetMapper petMapperMock;

	private PetService petService;

	@BeforeEach
	public void setUp() {
		this.petDaoMock = mock(PetDao.class);
		this.petMapperMock = mock(PetMapper.class);

		this.petService = new PetServiceImpl(this.petDaoMock, this.petMapperMock);
	}

	@Test
	public void getAPet_returnPetDto_whenAllIsOk() {

		// given
		final Pet pet = new Pet();
		pet.setId(1L);
		pet.setName("Toby");

		final PetDto petDto = new PetDto();
		petDto.setId(1L);
		petDto.setName("Toby");

		given(this.petDaoMock.findById(anyLong())).willReturn(Optional.of(pet));
		given(this.petMapperMock.mapPetEntityToPetDto(eq(pet))).willReturn(petDto);

		// when
		final PetDto result = this.petService.getAPet(1L);

		// then
		Assertions.assertNotNull(result);
		Assertions.assertEquals(1L, result.getId());
		Assertions.assertEquals("Toby", result.getName());

	}

}
