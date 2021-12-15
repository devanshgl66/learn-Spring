package learning.udemy.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("SP")
@Service("i18nLangService")
public class i18nSpanishService implements GreetingService{

	@Override
	public String sayGreetings() {
		// TODO Auto-generated method stub
		return "Hola Munda - SP";
	}

}
