package messages.management;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import messages.management.entities.User;
import messages.management.repositories.UsersRepository;

@SpringBootApplication
@EnableEurekaClient
public class ScaryTerryMessagesApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(ScaryTerryMessagesApplication.class, args);
	}
	
	@Bean
    ApplicationRunner init(UsersRepository UsersRepository) 
	{
        return args -> {
            Stream.of("Omar", "Ridha", "El Mahdi", "Majid").forEach(username -> 
            {
            	User user = new User();
            	user.setUsername(username);
            	UsersRepository.save(user);
            });
        };
    }
}
