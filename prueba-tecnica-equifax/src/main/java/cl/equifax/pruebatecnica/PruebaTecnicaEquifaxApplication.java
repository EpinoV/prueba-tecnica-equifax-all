package cl.equifax.pruebatecnica;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PruebaTecnicaEquifaxApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaTecnicaEquifaxApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI(){
		return new OpenAPI()
				.info(
						new Info()
								.title("Especificación Api REST - Prueba Técnica Equifax")
								.version(appVersion)
								.description("Cargo: Fullstack Developer")
								.termsOfService("http://swagger.io/terms")
								.license(new License().name("Apache 2.0").url("http://springdoc.org"))
				);
	}

	@Value( "${prueba-tecnica-equifax.version}" )
	private String appVersion;

}
