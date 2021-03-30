# <p align="center">Projeto Final - Accenture QA</p>

<p align="center">
    <a href="#time">Time</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#descrição">Descrição</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#como-utilizar">Como utilizar</a>&nbsp;&nbsp;&nbsp;
</p>

<br>

## Time
### <i> Status 200 - Grupo de sucesso </i>
Integrantes:

- [Aline Camilo Sena](https://github.com/bahamonde)
- [Cristiane Cordeiro Silva](https://github.com/crissbr)
- [Magali da Silva](https://github.com/dsmag)
- [Natália Belo](https://github.com/natbelo)
- [Patrícia Sampaio Verônica Bertozzi](https://github.com/patysiq)
- [Veronica Bertozzi](https://github.com/VeronicaBertozzi)

<br>

<br>

## Descrição
### Criar uma aplicação Selenium com os seguintes casos de teste:
<br>

### Caso de teste 1
Acessar o site da accenture e aceitar os cookies do LGPD

<b>Cenário:</b> Aceitar o cookie LGPD<br>
    Dado que eu estou no site da accenture <br>
    E aceito os termos LGPD <br>
    Então deve fechar a caixa de informação <br>

<b>Cenário:</b> Configurações do cookie<br>
    Dado que eu estou no site da accenture<br>
    E aceito os termos LGPD<br>
    E clico em configurações de cookie<br>
    Então devo ver o item de "sua privacidade"<br>
    E devo ver "Cookies estritamente necessárias"<br>
    E devo ver "Cookies Analíticos de Primeira Parte"<br>
    E devo ver "Cookies de Desempenho e Cookies Funcionais"<br>
    E devo ver "Cookies de Publicidade e Redes Sociais"<br>


<br>

### Caso de teste 2
Acessar o site da accenture a mostrar a lista de serviços

<b>Cenário:</b> Listar serviços da Accenture<br>
    Dado que eu estou no site da accenture<br>
    E clico no menu serviços<br>
    Então devo ver os serviços abaixo<br>
 - Accenture Strategy 
 - Application Services
 - Artificial Intelligence
 - Automation
 - Business Process Services
 - Change Management
 - Cloud
 - Customer Experience
 - Data & Analytics
 - Ecosystem Partners
 - Finance Consulting
 - Industry X
 - Infrastructure
 - Marketing
 - Mergers & Acquisitions (M&A)
 - Operating Models
 - Security
 - Supply Chain Management
 - Sustainability
 - Technology Consulting
 - Technology Innovation
 - Zero Based Budgeting (ZBB)

<b>Cenário:</b> Clicar no serviço cloud<br>
    Dado que eu estou no site da accenture<br>
    E clico no menu serviços<br>
    E clico no item do menu cloud<br>
    Então devo encontrar o título "Serviços de Cloud"<br>

<br>

### Caso de teste 3
Acessar a lista de carreiras da accenture

<b>Cenário: </b> Acessar o item de vagas de tecnologia<br>
    Dado que eu estou no site da accenture<br>
    E clico no menu carreiras<br>
    E clico no item do menu vagas em tecnologia<br>
    Então devo ver o destaque em "Carreiras em Tecnologia"<br>

<b>Cenário:</b> Procurando uma vaga<br>
    Dado que eu estou no site da accenture<br>
    E digito no campo de busca "desenvolvedor"<br>
    E clico no botão procurar<br>
    Então devo encontrar vagas para programadores<br>

<br>

### Caso de teste 4
Sobre a accenture

<b>Cenário:</b> Ver as características da accenture<br>
    Dado que eu estou no site da accenture<br>
    E clico no menu sobre a accenture<br>
    E clico no item do menu sobre a accenture<br>
    Então devo ver o destaque em "Nosso propósito"<br>

<br>

<br>

## Tecnologias


:heavy_check_mark: <b> [Java](https://www.java.com/pt-BR/) </b><br>
Linguagem de programação para desenvolvimento da aplicação <br>

:heavy_check_mark: <b> [Maven](https://maven.apache.org/) </b><br>
Gerenciador de dependências para desenvolvimento da aplicação <br>

:heavy_check_mark: <b> [Cucumber](https://cucumber.io/) </b><br>
Framework responsável por traduzir uma linguagem humana em código Java <br>

:heavy_check_mark: <b> [Selenium](https://www.selenium.dev/) </b><br>
Framework responsável por fazer a integração do código Java com a linguagem Gherkin(Cucumber), abrindo o browser e fazendo o teste de comportamento <br>

<br>

<br>

## Como utilizar

### Pré requisitos
- Instalar o [Java](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR)
- Instalar o [JDK](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
- Verificar se o JAVA_HOME está configurado em seu computador

- Clone do projeto
```bash
git clone https://github.com/dsmag/projeto-final-accenture-qa
```

- Entrando na pasta do projeto
```bash
cd projeto-final-accenture-qa
```

- Configurando Selenium
Fazer o download do [Chrome WebDriver](https://chromedriver.chromium.org/downloads) e colocar o arquivo desconpactado dentro da pasta drive na raiz do projeto

```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip

```

- Limpando e validando Maven com Unix
```bash
./mvnw clean
```

- Limpando e validando Maven com Windows
```bash
mvnw.cmd clean
```

- Executando teste com Unix
```bash
./test.sh
```

- Executando teste com Windows
```bash
./test.bat
```
## Estrutura de arquivos
```
  driver 

      |-- chromedriver -- Este é o arquivo do selenium webdriver, substitua este arquivo com a versão da sua máquina

  mvnw

  mvnw.cmd

  pom.xml

  src

    |-- test

    |  |-- java

    |  |  |-- io

    |  |  |  |-- cucumber

    |  |  |  |  |-- equipe200

    |  |  |  |  |  |-- servicos -- Pasta para colocar Classes em Java para usar nos arquivos Steps
    
    |  |  |  |  |  |  |-- Configuracao -- Conjunto de classes em java para facilitar o processo das Steps

    |  |  |  |  |  |-- CaracteristicasAccentureSteps.java -- Passos escritos em java com selenium abrindo o site e testando a aplicação
 
    |  |  |  |  |  |-- CompartilhadoSteps.java -- Passos escritos em java com selenium em comum entre os cenários
    
    |  |  |  |  |  |-- ConfigurarCookiesSteps.java -- Passos escritos em java com selenium abrindo o site e testando a aplicação
    
    |  |  |  |  |  |-- ListaDeCarreirasSteps.java -- Passos escritos em java com selenium abrindo o site e testando a aplicação
    
    |  |  |  |  |  |-- ListaDeServicosSteps.java -- Passos escritos em java com selenium abrindo o site e testando a aplicação

    |  |  |  |  |  |-- RunCucumberTest.java -- Arquivo que configura a inicialização do Java test

    |  |-- resources

    |  |  |-- io

    |  |  |  |-- cucumber

    |  |  |  |  |-- equipe200

    |  |  |  |  |  |-- caracteristicasAccenture.feature -- Gherkin com os cenários de teste de acordo com o meu cliente

    |  |  |  |  |  |-- configurarCookie.feature -- Gherkin com os cenários de teste de acordo com o meu cliente

    |  |  |  |  |  |-- listaDeCarreiras.feature -- Gherkin com os cenários de teste de acordo com o meu cliente

    |  |  |  |  |  |-- listaDeServicos.feature -- Gherkin com os cenários de teste de acordo com o meu cliente

  test.bat -- Arquivo para rodar teste no Windows
  
  test.sh -- Arquivo para rodar teste no Unix
```