package br.com.fiap.api_rest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API de Produtos",
								version = "v1",
								description = "API RESTful de produtos com Swagger e Validation",
								license = @License(name = "MIT", identifier = "MIT"),
								contact = @Contact(name = "RM562980", email = "rm562980@fiap.com.br")))
public class ApiRestApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApiRestApplication.class, args);
	}

}
