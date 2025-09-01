# Sistema de Gerenciamento de Waypoints

## Descrição

Este é um sistema de back-end para criar e gerenciar waypoints (pontos de referência geográficos). A aplicação permite salvar locais com nome, descrição, coordenadas (latitude e longitude), data de evento e uma cor associada.

## Funcionalidades

O sistema oferece uma API REST para realizar as seguintes operações:

* **Criar** um novo waypoint.
* **Ler** todos os waypoints ou um waypoint específico por ID.
* **Atualizar** as informações de um waypoint existente.
* **Deletar** um waypoint.

### Sistema de Cores por Tempo

A cor do waypoint é definida dinamicamente com base na data do evento em relação à data atual:

* 🔴 **Vermelho:** O evento acontece **hoje**.
* 🟠 **Laranja:** Faltam **menos de 7 dias** para o evento.
* 🟡 **Amarelo:** Faltam **entre 7 e 14 dias** para o evento.
* 🟢 **Verde:** Faltam **mais de 14 dias** para o evento.

## 🚀 Tecnologias Utilizadas

O projeto foi construído com as seguintes tecnologias:

* **Java 21**
* **Spring Boot 3.5.5**
* **Spring Data JPA**
* **Spring Web**
* **H2 Database** (para desenvolvimento e testes)
* **Maven**
* **Lombok**

## Futura Integração com Mapas

Está planejada a integração desta API com um serviço de mapas (como Google Maps, por exemplo). O objetivo é permitir que o usuário final possa, através de uma interface visual:

* Visualizar todos os waypoints cadastrados em um mapa, com as cores indicando a proximidade do evento.
* Clicar em um ponto no mapa para obter as coordenadas e cadastrar um novo waypoint de forma interativa.
* Ver os detalhes de um waypoint ao clicar em seu marcador no mapa.

## ⚙️ Como Executar

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/DaniloAlves1902/waypoint-managment
    ```
2.  **Navegue até a pasta do projeto:**
    ```bash
    cd waypoint-managment
    ```
3.  **Execute o projeto com o Maven:**
    ```bash
    ./mvnw spring-boot:run
    ```
4.  A aplicação estará disponível em `http://localhost:8080`.
