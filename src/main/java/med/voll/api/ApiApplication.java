package med.voll.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	//Para subir o projeto pelo java e escolher o profile é só executar o comando abaixo
	//java -Dspring.profiles.active=prod -jar target/api-0.0.1-SNAPSHOT.jar

	//Se estiver usando de variáveis de ambiente o comando muda
	//java -Dspring.profiles.active=prod -DDATASOURCE_URL=jdbc:h2:mem:testdb -DDATASOURCE_USERNAME=sa -DDATASOURCE_PASSWORD=123 -jar target/api-0.0.1-SNAPSHOT.jar

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
