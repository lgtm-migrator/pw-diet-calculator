package com.paipweb.pwdietcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PwDietCalculatorApplication {

    private static final String CONTEXT_PATH = "/api";

	public static void main(String[] args) {
		SpringApplication.run(PwDietCalculatorApplication.class, args);
	}

	@Bean
	public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> webServerFactoryCustomizer() {
		return factory -> factory.setContextPath(CONTEXT_PATH);
	}
}
