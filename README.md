# Desafio Programador Fullstack UNOESC

Esse é o nosso desafio para a vaga de programador fullstack na [UNOESC](https://www.unoesc.edu.br/). Serão testadas as habilidades e qualidade de código ao transformar requisitos limitados em uma aplicação web.

## DESAFIO

Desenvolver uma aplicação web responsável por se conectar à API REST do Serviço do Portal da Transparência do Governo Federal. A requisição deverá ser realizada especificamente no *endpoint* de "Consulta aos registros dos beneficiários por município e mês/ano" do *path* de "Benefícios ao cidadão".

Documentação disponível em: [Swagger UI](https://api.portaldatransparencia.gov.br/swagger-ui.html)

Segue em destaque na imagem, extraída da documentação, o *endpoint* a ser utilizado:
<div align="center">
	<img src="https://user-images.githubusercontent.com/12573430/159770511-5363ace6-35fe-45de-add4-298bd601c3af.png" />
</div>

### ESCOPO DO DESAFIO

**Requisitos**
- A aplicação deve ser protegida (usuario pode acessar somente com autenticação);
- A tela de consulta deve permitir informar um mês/ano e o código IBGE do município, então consultar os dados na API especificada;
- Com o resultado obtido da consulta a aplicação deve extrair um relatório no formato CSV com o valor total de benefícios recebidos por parcela no município;
- O resultado também deverá ser persistido na base de dados;
- Versionar o projeto realizando commits com comentários do que está sendo implementado;
- Soluções parciais serão aceitas, mas o que for submetido deve estar funcionando.

Para auxílio, elaboramos um diagrama de classes simples, apenas com seus nomes e atributos, para compor informações do resultado (a ser persistido e extraído no CSV): 
<div align="left">
	<img src="https://user-images.githubusercontent.com/12573430/159984550-207dc17c-54e7-453d-9883-be9d6535fb7e.png" />
</div>

**Documentar todas as suposições realizadas sobre o desafio no arquivo README.md.**
- Exemplo de suposição: 
- A tela de pesquisa não permite consultar sem informar o código IBGE.

**Tecnologias a serem utilizadas:**
- Java 8;
- Spring Boot;
- Maven;
- Thymeleaf;
- MySQL;
- Git;

### AVALIAÇÃO

**O código será avaliado de acordo com os critérios:**
- Build e execução da aplicação;
- Completude das funcionalidades;
- Qualidade de código (design pattern, manutenibilidade, clareza); 
- Histórico do Git; 
- Boas práticas de UI (Interface com o Usuário);
- Sentido e coerência nas respostas aos questionamentos na entrevista de apresentação do desafio realizada pelo candidato.

**Não esqueça de documentar o processo necessário para rodar a aplicação.**

Login e senha para o site.
admin
admin


Para iniciar o desenvolvimento. Foi criado um fork e em seguida clonado o repositório do fork.
O Clone foi feito via source control do VSCode.
Desenvolvimento será pelo VSCode com spring boot tools adicionados como extensão a IDE.
Inicialmente será incluida um controller para uma rota e em seguida uma página html com thymeleaf.
Segundo passo sera configurar o banco de dados mysql e criar os modelos, lembrando que tudo isso será dentro da organização MVC.
Verifiquei que já existiam as dependencias para o Thymeleaf, somente inclui a pasta templates e o arquivos htmls.
Configuração do application.properties
Incluidos modeloes de dados
Configurando meu banco mysql. user root pass admin.
Criado novo banco .. 
Download dos arquivos do bootstrap inseridos em resources / static


mudada porta para 8081 pois a 8080 estava sendo usada


Cadastro em gov.br e autenticação em 2 etapas para o governo
Gerada chave para validar a api do governo 
Chave:
		 "[{"key":"chave-api-dados","value":"c07b50fda5b4065168455533a1a1ebeb"}]
		Código ibge municipio 4207809
        

Criação do database
create database unoescdesafio;
Jpa faz automaticamente a criação das tabelas no banco

