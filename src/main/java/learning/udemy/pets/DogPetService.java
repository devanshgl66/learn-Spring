package learning.udemy.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("DOG")
@Service
public class DogPetService implements PetService {

	@Override
	public String getpetType() {
		// TODO Auto-generated method stub
		return "Dogs are the best";
	}

}
