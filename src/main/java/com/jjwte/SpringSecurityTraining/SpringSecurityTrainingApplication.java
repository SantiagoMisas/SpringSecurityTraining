package com.jjwte.SpringSecurityTraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringSecurityTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityTrainingApplication.class, args);}

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Bean
	public CommandLineRunner createPasswordsCommand() {
		return args->{
			System.out.println(passwordEncoder.encode("customerrole"));
			System.out.println(passwordEncoder.encode("administratorrole"));
		};
	}


}
