# Diabetes Spring API

Implementação para calcular o risco de diabetes utilizando a lógica fuzzy para grupo de intervenção ou comparativo.

## Sumário
  - [Tecnologias requisitadas](#tecnologias-requisitadasa)
  - [Configurar e executar o projeto](#conf-exe-proj)
    - [Via terminal](#conf-exe-proj-bash)
    - [Via IntelliJ IDEA](#conf-exe-proj-intellij)

## Tecnologias requisitadas<a name="tecnologia-requisitadas"></a>
  - Java: v18
  - Maven: v3.6.3 ou mais recente

## Configurar e executar o projeto<a name="conf-exe-proj"></a>
Certifique-se de instalar as versões corretas das tecnologias. Os seguintes comandos são para verificar as versões do **Java** e **Maven**:
```bash
java -version
mvn -version
```
A seguir, confira os tópicos para configurar e executar o projeto pelo terminal Linux ou pela IDE IntelliJ IDEA.

### Via terminal<a name="conf-exe-proj-bash"></a>
1. Acesse a pasta raiz do projeto e execute o comando para configurá-lo:
```bash
mvn clean install
```

2. Após o build do projeto finalizar com sucesso, basta executá-lo através do comando:
```bash
mvn spring-boot:run
```

3. Quando a API estiver funcionando, aparecerá um mensagem informando que a aplicação **`DiabetesSpringApplication`** está ligada, então pode começar a fazer requisições HTTP.

### Via IntelliJ IDEA<a name="conf-exe-proj-intellij"></a>
1. Abra o a pasta raiz do projeto pela IDE.

2. Certifique-se que a IDE configurou com a versão correta do Java. Para isso, pressione **`Shift`** duas vezes e digite **Project Structure**. Na janela seguinte, clique na aba **Project** e seleciona a versão 18 do SDK. Depois, clique no botão **OK**.

3. Assim que finalizar, procure pela classe ou arquivo **`DiabetesSpringApplication** e execute o projeto normalmente ou com um debugger.

5. Quando a API estiver funcionando, aparecerá um mensagem informando que a aplicação **`DiabetesSpringApplication`** está ligada, então pode começar a fazer requisições HTTP.
