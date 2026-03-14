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

## Próximos passos:
- [x] Escrever controllers para cada entidade, com get, put, post e delete 
- [x] Descrever regras de negócio no service
- [ ] Colocar comportamento para cada role
- [x] Fazer o front end em Angular + Tailwind
- [x] Escrever os domains entities
- [x] Definir os repositories
- [x] Definir a lógica do JWT
- [x] Escrever os DTOS
- [x] Escrever ValueObjects com validação
- [ ] Implementar kafka para mensagens
- [ ] Implementar Prometheus para visualização
- [ ] Colocar ClickHouse
- [x] Colocar Docker
- [x] Construir o banco de dados em PostgreSQL
- [x] Usar nginx e cloudfare

# Infraestrutura do sistema

O projeto utiliza uma arquitetura de microserviços containerizada, garantindo isolamento, segurança e facilidade de deploy.

### Camadas de Segurança e Infra
* **Proxy Reverso (Nginx):** Atua como o único ponto de entrada para as requisições, protegendo a API Java.
* **Autenticação Básica (HTTP Basic Auth):** Camada extra de segurança via `.htpasswd` (algoritmo bcrypt/apr1) para filtrar acessos indesejados e bots.
* **Cloudflare Tunnel:** Exposição segura para a internet sem abertura de portas no roteador, ocultando o IP real da máquina servidora.
* **Docker Network:** Isolamento total entre os serviços, utilizando `aliases` para comunicação interna (o Java acessa o banco via `localhost` dentro do contexto do container).

## Decisões Técnicas para Alta Performance
Considerando a execução em hardware com recursos limitados (PC antigo), foram tomadas as seguintes decisões:
* **Imagens Alpine:** Uso sistemático de distribuições **Alpine Linux** para os containers (Postgres, Nginx e Apache), reduzindo o consumo de RAM e o tamanho das imagens em mais de 70%.
* **Single-Stage Build Otimizado:** Dockerfile estruturado para gerar builds enxutos e rápidos.
* **Persistência com PostgreSQL 15-alpine:** Escolha estratégica por uma versão estável e leve para o gerenciamento de dados.

## Como Executar o Ambiente

### Pré-requisitos
* Docker e Docker Compose instalados.
* Um domínio configurado na Cloudflare (para o túnel).

### Instalação e Deploy Local
1. Clone o repositório:
   ```bash
   git clone [https://github.com/seu-usuario/seu-projeto.git](https://github.com/seu-usuario/seu-projeto.git)
   cd seu-projeto/infra
