package br.com.pokedex.apipoke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@RestController
public class ApipokeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApipokeApplication.class, args);
	}
	
	@GetMapping("/")
	public String hello(){
		return String.format("Hello World");
	}

	@GetMapping("/quielaer")
	public String quielaer(){
		return String.format("quielaer World");
	}

	@GetMapping("/vini")
	public String vini(){
		return String.format("vini bocó World");
	}
}
