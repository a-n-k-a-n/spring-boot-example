package ankan.springboot.example.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActuatorApplication {

	public static void main(String[] args) {
		System.out.println("actuator test works");
		SpringApplication.run(ActuatorApplication.class, args);
	}

}
