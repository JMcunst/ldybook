package com.jmcunst.ldybook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class LdybookApplication {

	public static void main(String[] args) {
		SpringApplication.run(LdybookApplication.class, args);
	}

}
