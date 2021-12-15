package learning.udemy.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("CAT")
@Service
public class CatPetService implements PetService {

	@Override
	public String getpetType() {
		// TODO Auto-generated method stub
		return "Cats are the best";
	}

}
