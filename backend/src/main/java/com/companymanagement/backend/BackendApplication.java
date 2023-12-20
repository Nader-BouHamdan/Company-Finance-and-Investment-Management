package com.companymanagement.backend;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.companymanagement.backend.model.Trades;
import com.companymanagement.backend.service.TradesService;

@SpringBootApplication
public class BackendApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}


}



