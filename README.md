# Aplicação em SpringBoot 3 para uma clinica médica
Esta é uma aplicação para estudos sobre o Spring Boot 3

## O que está incluso nessa aplicação?
### Conceitos de Controller
### Segurança com o Spring Security OAuth2.0
### Teste unitário TDD
### Documentação com o Swagger

## Build do projeto

Para subir o projeto via terminal segue o comandos abaixo para execução:
O comando java -Dspring.profiles.active=prod -jar target/api-0.0.1-SNAPSHOT.jar é utilizado para executar o arquivo .jar 
gerado a partir do projeto. O parâmetro -Dspring.profiles.active=prod define o perfil de execução como "prod", 
indicando que as configurações do ambiente de produção devem ser utilizadas. O arquivo .jar 
especificado após o parâmetro -jar é o arquivo executável gerado pelo Maven durante o build do projeto.

`java -Dspring.profiles.active=prod -jar target/api-0.0.1-SNAPSHOT.jar`

### Caso esteja usando variáveis de ambiente:

Se estiver usando de variáveis de ambiente o comando muda conforme abaixo:
-D mais o nome definido na variável de ambiente

`java -Dspring.profiles.active=prod -DDATASOURCE_URL=jdbc:h2:mem:testdb -DDATASOURCE_USERNAME=sa -DDATASOURCE_PASSWORD=123 -jar target/api-0.0.1-SNAPSHOT.jar`

