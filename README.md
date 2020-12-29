<h1 align="center">
    <img alt="Orbit Trip" src="./assets/banner.jpg" width="50%"/>
    <br>
    API REST Spring-Boot
</h1>

<h4 align="center">
  API REST para cadastro e consulta de contatos.
</h4>

## Descrição

- Este projeto foi desenvolvido em [Java](https://www.java.com/pt-BR/download/help/whatis_java.html) com [Spring-Boot](https://spring.io/projects/spring-boot) para fins de capacitação pessoal.

## Como Usar

Para clonar e compilar este projeto, você precisará [Git](https://git-scm.com),
[Java 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) ou superior instalado em seu
computador:

```bash
# Clone this repository
$ git clone https://github.com/osterloh/agenda-contatos.git

# Realizar build
$ gradle build

# Compilar
$ gradle bootRun
```

## Banco de Dados

- Neste projeto foi utilizado o banco de dados [PostgreSQL](https://www.postgresql.org/), as definições podem ser refatoradas no arquivo <i>application.properties</i> no diretório resources.
- Para compilar o projeto, é necessário ter criado a base de dados antes, neste projto foi criado como exemplo o 'agenda-contato'.

## Descrição do Projeto

- Este projeto é uma API REST, desenvolvida em Java com Spring-Boot, tendo como base o cadastro e leitura de Contatos.
- Para realizar a comunicação de uma aplicação front-end ou algum sistema de testes dos métodos HTTP, foi configurada uma rota que pode ser acessada pelo link: http://localhost:8080, após startar o projeto.
- Para cadastrar um novo contato, foi configurado o método HTTP POST, na rota 'api/contato', http://localhost:8080/api/contato.
- Para listar os contatos cadastrados, foi configurado o método HTTP GET, na rota 'api/contatos', http://localhost:8080/api/contato.
- Para listar um contato específico cadastrado, foi configurado o método HTTP GET, na rota 'api/contatos/${id}', http://localhost:8080/api/contato/${id}, sendo necessário informar por parâmetro o ID do contato esperado.
- Para editar um contato cadastrado, foi configurado o método HTTP PUT, na rota 'api/contato', http://localhost:8080/api/contato, sendo necessário passar o objeto contato com todas as informações, principalmente o ID, para editar o contato.
- Para apagar um contato cadastrado, foi configurado o método HTTP DELETE, na rota 'api/contato', http://localhost:8080/api/contato, sendo necessário passar o objeto contato com todas as informações, principalmente o ID, para deletar o contato.

- Foi configurado um <strong>repository</strong> com o método <strong>findAll()</strong> o qual é utilizado na rota de listagem dos contatos cadastrados, para as demais rotas foi utilizado os próprios métodos do Spring-Boot configurados em <i>JpaRepository</i>.

- Na model foi utilizado <strong>lombok</strong> para definir os métos get, set, modificadores de acesso, os construtores e definição da tabela a ser criada no banco.

- Para documentação da API foi utilizado o <strong>Swagger</strong>, que pode ser acessado pelo link: http://localhost:8080/swagger-ui.html, após startar o projeto.

## Technologies

Este projeto foi desenvolvido com a finalidade de capacitação pessoal, utilizando as seguintes tecnologias:

- [Java 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Gradle](https://gradle.org/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Swagger](https://swagger.io/)
- [Lombok](https://projectlombok.org/)
- [PostgreSQL](https://www.postgresql.org/)
- [Docker](https://www.docker.com/)
- [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)
- [Insomnia](https://insomnia.rest/download/)
- [DBeaver](https://dbeaver.io/)

---

Desenvolvido por [Johnatan Luiz Osterloh](https://www.linkedin.com/in/johnatanosterloh/)
