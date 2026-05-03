# 🚀 API de Cadastro - Barbearia Castelo Branco

API REST desenvolvida com **Spring Boot** para gerenciamento de usuários e dados do sistema da Barbearia Castelo Branco.
Responsável por fornecer os dados para o frontend (React), garantindo organização, escalabilidade e segurança.

---

## 📌 Funcionalidades

* 👤 Cadastro de usuários
* 🔐 Autenticação básica (login)
* 📋 Listagem de usuários
* ✏️ Atualização de dados
* ❌ Remoção de usuários
* 🌐 Integração com frontend

---

## 🛠️ Tecnologias utilizadas

* ☕ Java 21+
* 🌱 Spring Boot
* 🗄️ Spring Data JPA
* 🔗 Spring Web (REST API)
* 🐬 Banco de dados (SupaBase - PostgreSQL)
* 🔄 Maven

---

## 📂 Estrutura do projeto

```id="m6a9cb"
src/
│
├── controller/     # Endpoints da API
├── service/        # Regras de negócio
├── repository/     # Comunicação com banco
├── model/          # Entidades
└── config/         # Configurações
```

---

## 🚀 Como rodar o projeto

### 1. Clone o repositório

```
git clone hhttps://github.com/Lidyell/API_CADASTRO.git
```

### 2. Acesse a pasta

```
cd Projeto
```

### 3. Execute o projeto

Se estiver usando Maven:

```
./mvnw spring-boot:run
```

Ou:

```
mvn spring-boot:run
```

---

## ⚙️ Configuração do banco de dados

No arquivo `application.properties`:

```properties id="3r7k9w"
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 🔗 Endpoints principais

### 📌 Cadastro de usuário

```http id="yxfu6y"
POST /usuarios
```

### 📌 Listar usuários

```http id="j9n8pq"
GET /usuarios
```

### 📌 Buscar usuário por ID

```http id="6k0z9m"
GET /usuarios/{id}
```

### 📌 Deletar usuário

```http id="m1x7op"
DELETE /usuarios/{id}
```

---

## 🔐 Segurança (futuro)

* JWT Authentication
* Criptografia de senha
* Controle de acesso (roles)

---

## 🌐 Integração com Frontend

Esta API é consumida pelo frontend React:

👉 https://github.com/Lidyell/Barbearia_Projeto

---

## 🧠 Boas práticas aplicadas

* Separação em camadas (Controller, Service, Repository, Model)
* Padrão REST
* Código organizado e escalável

---

## 📌 Próximas melhorias

* 🔐 Implementar autenticação com JWT
* 📆 Sistema de agendamentos
* 📊 Relatórios e métricas
* 🧾 Validações com Bean Validation
* 🐳 Docker para deploy

---

## 👨‍💻 Autor

Desenvolvido por **Lidyell Rocha**

---

## 📄 Licença

Este projeto está sob a licença MIT.
