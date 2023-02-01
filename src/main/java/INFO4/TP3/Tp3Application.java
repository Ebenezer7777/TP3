package INFO4.TP3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp3Application implements ApplicationRunner{

	@Bean
	public org.springframework.web.client.RestTemplate restTemplate() {
		return new org.springframework.web.client.RestTemplate();
	}

	@Autowired
	AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(Tp3Application.class, args);
	}

}
