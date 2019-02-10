package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HttpHttpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpHttpsApplication.class, args);
	}

	@GetMapping(path = { "/", "/dd" })
	public ResponseEntity<?> dd() {
		return ResponseEntity.ok("OK");
	}

}
