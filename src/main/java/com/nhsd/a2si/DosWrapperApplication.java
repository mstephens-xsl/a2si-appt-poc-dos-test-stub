package com.nhsd.a2si;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.nhsd.a2si"})

public class DosWrapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(DosWrapperApplication.class, args);
	}
}
