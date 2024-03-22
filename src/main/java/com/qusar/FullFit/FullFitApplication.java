package com.qusar.FullFit;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
@Log
public class FullFitApplication {
	public static void main(String[] args) {
		SpringApplication.run(FullFitApplication.class, args);
	}

}
