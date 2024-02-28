package med.voll.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	//Para subir o projeto pelo java e escolher o profile é só executar o comando abaixo
	//java -Dspring.profiles.active=prod -jar target/api-0.0.1-SNAPSHOT.jar

	//Se estiver usando de variáveis de ambiente o comando muda
	//java -Dspring.profiles.active=prod -DDATASOURCE_URL=jdbc:h2:mem:testdb -DDATASOURCE_USERNAME=sa -DDATASOURCE_PASSWORD=123 -jar target/api-0.0.1-SNAPSHOT.jar

	/*Projetos que utilizam o Spring Boot geralmente utilizam o formato jar para o empacotamento da aplicação, conforme foi demonstrado ao longo desta aula. Entretanto, o Spring Boot fornece suporte para o empacotamento da aplicação via formato war, que era bastante utilizado em aplicações Java antigamente.

	Caso você queira que o build do projeto empacote a aplicação em um arquivo no formato war, vai precisar realizar as seguintes alterações:

			1) Adicionar a tag <packaging>war</packaging> no arquivo pom.xml do projeto, devendo essa tag ser filha da tag raiz <project>:
	*/

	/*<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.0.0</version>
    <relativePath/> <!-- lookup parent from repository -->
  </parent>
  <groupId>med.voll</groupId>
  <artifactId>api</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <name>api</name>

  <packaging>war</packaging>*/

	//2) Ainda no arquivo pom.xml, adicionar a seguinte dependência:




	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
