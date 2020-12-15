package com.example.demo;

import com.example.demo.model.Role;
import com.example.demo.repository.RoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

//    @Autowired
//    RoleRepository repository;

    /*Log*/
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(RoleRepository repository) {
        return (args) -> {
            // save a few customers
            repository.save(new Role("Jack", "Bauer", ""));
            repository.save(new Role("Chloe", "O'Brian", ""));
            repository.save(new Role("Kim", "Bauer", ""));
            repository.save(new Role("David", "Palmer", ""));
            repository.save(new Role("Michelle", "Dessler", ""));

//            // fetch all customers
//            log.info("Customers found with findAll():");
//            log.info("-------------------------------");
//            for (Role role : repository.findAll()) {
//                log.info(role.toString());
//            }
//            log.info("");

//            // fetch an individual customer by ID
//            Role role = repository.findById(1L);
//            log.info("Customer found with findById(1L):");
//            log.info("--------------------------------");
//            log.info(role.toString());
//            log.info("");

//            // fetch customers by last name
//            log.info("Customer found with findByLastName('Bauer'):");
//            log.info("--------------------------------------------");
//            repository.findByLastName("Bauer").forEach(bauer -> {
//                log.info(bauer.toString());
//            });
//            // for (Customer bauer : repository.findByLastName("Bauer")) {
//            //  log.info(bauer.toString());
//            // }
            log.info("");
        };
    }

}
