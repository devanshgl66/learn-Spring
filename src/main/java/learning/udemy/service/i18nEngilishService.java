package learning.udemy.service;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"default","EN"})
@Service("i18nLangService")
public class i18nEngilishService implements GreetingService{
	@Override
	public String sayGreetings() {
		return "Hello World EN";
	}
	
}
