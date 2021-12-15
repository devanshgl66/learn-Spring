package learning.udemy.sfgdi.controller;

import org.springframework.stereotype.Controller;

import learning.udemy.pets.PetService;

@Controller
public class PetController {
	PetService petService;

	public PetController(PetService petService) {
		super();
		this.petService = petService;
	}
	public String whichPetIsBest() {
		return petService.getpetType();
	}
}
