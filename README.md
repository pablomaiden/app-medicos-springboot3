# app-medicos-springboot3
Esta é uma aplicação para estudos sobre o Spring Boot 3



# Build do projeto

Para subir o projeto via terminal segue o comandos abaixo para execução:
O comando java -Dspring.profiles.active=prod -jar target/api-0.0.1-SNAPSHOT.jar é utilizado para executar o arquivo .jar 
gerado a partir do projeto. O parâmetro -Dspring.profiles.active=prod define o perfil de execução como "prod", 
indicando que as configurações do ambiente de produção devem ser utilizadas. O arquivo .jar 
especificado após o parâmetro -jar é o arquivo executável gerado pelo Maven durante o build do projeto.

java -Dspring.profiles.active=prod -jar target/api-0.0.1-SNAPSHOT.jar


Se estiver usando de variáveis de ambiente o comando muda
java -Dspring.profiles.active=prod -DDATASOURCE_URL=jdbc:h2:mem:testdb -DDATASOURCE_USERNAME=sa -DDATASOURCE_PASSWORD=123 -jar target/api-0.0.1-SNAPSHOT.jar

Projetos que utilizam o Spring Boot geralmente utilizam o formato jar para o empacotamento da aplicação, conforme foi demonstrado ao longo desta aula. Entretanto, o Spring Boot fornece suporte para o empacotamento da aplicação via formato war, que era bastante utilizado em aplicações Java antigamente.

Caso você queira que o build do projeto empacote a aplicação em um arquivo no formato war, vai precisar realizar as seguintes alterações:

