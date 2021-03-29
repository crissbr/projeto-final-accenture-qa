#language: pt
@ignore
Funcionalidade: Acessar o site da accenture e aceitar os cookies do LGPD

        Cenario: Aceitar o cookie LGPD
        Dado que eu estou no site da accenture
        E clico em configurações de cookie
        Entao deve fechar a caixa de informacao

        Cenario: Configuraçoes do cookie
        Dado que eu estou no site da accenture
        E clico em configuracoes de cookie
        Entao devo ver o item de "Sua privacidade"
        E devo ver "Cookies estritamente necessárias"
        E devo ver "Cookies Analíticos de Primeira Parte"
        E devo ver "Cookies de Desempenho e Cookies Funcionais"
        E devo ver "Cookies de Publicidade e Redes Sociais"
