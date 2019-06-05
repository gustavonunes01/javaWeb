package com.controleDeEstagio;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class ControleDeEstagioApplication {
	//static String FILE_URI = "file:eclipse-workspace/controleDeEstagio/hsqldb.jar";
	public static void main(String[] args) {
	
		SpringApplication.run(ControleDeEstagioApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("123"));
	}
	
	
}
