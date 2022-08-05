package com.servermanager10;

import com.servermanager10.model.Server;
import com.servermanager10.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.servermanager10.enumeration.Status.SERVER_DOWN;
import static com.servermanager10.enumeration.Status.SERVER_UP;

@SpringBootApplication
public class ServerManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerManagerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo){
		return args -> {
			serverRepo.save(new Server(null, "192.168.1.160", "Windows 10 Desktop", "32 GB",
					"Personal PC", "http://localhost:8080/server/image/server3.png", SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.58", "Windows 10 Surface Pro", "8 GB",
					"School and Personal PC", "http://localhost:8080/server/image/server3.png", SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.21", "Windows 10 Laptop", "8 GB",
					"Shared Home Laptop", "http://localhost:8080/server/image/server3.png", SERVER_DOWN));
			serverRepo.save(new Server(null, "192.168.1.14", "Ubuntu Linux Laptop", "16 GB",
					"Development PC", "http://localhost:8080/server/image/server3.png", SERVER_DOWN));
			serverRepo.save(new Server(null, "192.168.1.33", "Justin's Iphone 12 iOSX", "4 GB",
					"Mobile Phone", "http://localhost:8080/server/image/server3.png", SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.34", "Iphone 11 iOSX", "4 GB",
					"Mobile Phone", "http://localhost:8080/server/image/server3.png", SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.38", "Iphone 11 iOSX", "4 GB",
					"Mobile Phone", "http://localhost:8080/server/image/server3.png", SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.42", "Iphone 11 iOSX", "4 GB",
					"Mobile Phone", "http://localhost:8080/server/image/server3.png", SERVER_UP));
		};
	}

}
