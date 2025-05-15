# Jogo Espacial

## Descrição
O Jogo Espacial é um jogo 2D simples desenvolvido em Java utilizando a biblioteca libGDX. O jogo se passa em um mapa espacial repleto de obstáculos representados por planetas. O jogador controla uma nave em forma de seta, que pode ser movida pelo usuário, enquanto tenta evitar colisões com os planetas.

## Estrutura do Projeto
O projeto é organizado da seguinte forma:

- **android/**: Contém os arquivos específicos para a versão Android do jogo.
- **core/**: Contém a lógica principal do jogo, incluindo entidades, mapas e telas.
- **desktop/**: Contém os arquivos específicos para a versão desktop do jogo.
- **assets/**: Contém os recursos do jogo, como imagens e mapas.
- **gradle/**: Contém arquivos relacionados ao Gradle, que é utilizado para gerenciar as dependências do projeto.

## Requisitos
- Java JDK 8 ou superior
- Gradle 6.0 ou superior
- libGDX

## Instalação
1. Clone o repositório:
   ```
   git clone <URL_DO_REPOSITORIO>
   ```
2. Navegue até o diretório do projeto:
   ```
   cd jogo-espacial
   ```
3. Execute o Gradle para baixar as dependências:
   ```
   ./gradlew setupDecompWorkspace
   ./gradlew eclipse
   ```
   ou, se estiver usando IntelliJ:
   ```
   ./gradlew idea
   ```

## Execução
Para executar o jogo, você pode usar os seguintes comandos:

- Para a versão desktop:
  ```
  ./gradlew desktop:run
  ```

- Para a versão Android, você pode importar o projeto no Android Studio e executar diretamente pelo IDE.

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.

## Licença
Este projeto está licenciado sob a MIT License. Veja o arquivo LICENSE para mais detalhes.