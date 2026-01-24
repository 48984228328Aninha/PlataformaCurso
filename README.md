# PlataformaCurso
Sistema de cursos voltados a programação.
# 📚 Sistema de curso

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)

Este é um sistema de backend robusto para gestão de cursos online, permitindo o controle de instrutores, conteúdos programáticos, matrículas e autenticação de usuários.

---

## 🛠️ Tecnologias e Ferramentas

* **Linguagem:** Java 21
* **Framework:** Spring Boot 3.x
* **Segurança:** Spring Security & JWT (JSON Web Token)
* **Banco de Dados:** PostgreSQL
* **Documentação:** Swagger (OpenAPI 3)
* **Containerização:** Docker & Docker Compose
* **Testes:** JUnit 5, Mockito

## 🏗️ Arquitetura do Projeto

O projeto segue os princípios da **Clean Architecture** e foca em alta coesão e baixo acoplamento:

-------------------------------------------------------------------------
| 📚 Arquitetura                                                        |
|-----------------------------------------------------------------------

```text
 Este é um sistema de backend robusto para gestão de cursos online,    
 focado em programação, permitindo o controle de conteúdos,            
 matrículas e progresso dos alunos.
```

---------------------------------------------------------------------------                                                                    
| src/main/java/com/curso/demo/                                           |
|--------------------------------------------------------------------------
| ├── `application/`           * Camada de Orquestração                   |
| │   `├── mapper/`            # Conversão de DTOs para Entidades         |
| │   `├── services/`          # Serviços de aplicação                    |
| │   `└── useCases/`          # Regras de fluxo de negócio               |
| ├── `domain/`                # O Coração do Negócio (DDD)               |
| │   `├── entities/`          # Classes (User, Course, Enroll)           |
| │   `├── events/`            # Eventos de domínio                       |
| │   `├── repositories/`      # Interfaces de acesso a dados             |
| │   `├── services/`          # Regras de negócio complexas              |
| │   `└── valueobjects/`      # Objetos de valor (Email, UUID)           |
| ├── `infraestructure/`       # Implementações Técnicas                  |
| │   `├── config/`            # Configurações do Spring e Beans          |
| │   `├── external/`          # Integrações com APIs externas            |
| │   `└── persistence/`       # Repositórios JPA e Postgres              |
| └── `interfaces/`            # Entrada e Saída (IO)                     |
|     `├── controllers/`       # Endpoints da API (REST)                  |
|     `├── presenters/`        # Formatação de respostas                  |
|     `└── routes/`            # Definição de rotas                       |
|                                                                         |
--------------------------------------------------------------------------
- **Web/Controller:** Camada de exposição da API REST.
- **Business/Service:** Contém as regras de negócio e validações.
- **Persistence/Repository:** Interface de comunicação com o banco de dados via Spring Data JPA.
- **Domain/Entity:** Representação das tabelas do banco de dados.
- **DTOs:** Objetos de transferência para garantir a segurança dos dados expostos.

---

## 🚀 Como Rodar o Projeto

### 1. Pré-requisitos
* Docker e Docker Compose instalados.
* (Opcional) Java 21 e Maven 3.9+ se desejar rodar fora do container.

### 2. Clonar o Repositório
```bash
git clone [https://github.com/seu-usuario/nome-do-repositorio.git](https://github.com/seu-usuario/nome-do-repositorio.git)
cd nome-do-repositorio
