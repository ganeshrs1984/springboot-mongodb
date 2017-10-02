package com.tech.springbootmangodb.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.tech.springbootmangodb.Repository.AppartmentRepository;
import com.tech.springbootmangodb.domain.Appartment;
//comfig
@EnableMongoRepositories(basePackageClasses = AppartmentRepository.class)
@Configuration
public class MongoDBConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(AppartmentRepository appartmentRepository){
		System.out.println("Hello Check");
		return strings ->  {
			appartmentRepository.save(new Appartment("001", "RAMS-GATE", "HOPKINS", 800, "MN", "USA"));
			appartmentRepository.save(new Appartment("002", "StoneGate", "CLIVE", 1200, "IA", "USA"));
			 
		};
		
		
	}
	

}
