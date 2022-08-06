package com.rahim.server;

import com.rahim.server.enumeration.Status;
import com.rahim.server.model.Server;
import com.rahim.server.repository.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootServerApplication.class, args);
    }

    /*@Bean
    CommandLineRunner commandLineRunner(ServerRepo serverRepo) {
        return args -> {
            serverRepo.save(new Server(
                    null,
                    "192.168.1.254",
                    "Ubuntu Linux",
                    "16 GB",
                    "PC",
                    "http://localhost:8080/server/image/server1.png",
                    Status.SERVER_UP));
        };
    }*/
}
