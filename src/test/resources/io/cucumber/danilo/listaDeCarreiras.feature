#language: pt

Funcionalidade: Acessar a lista de carreiras da accenture

  # Cenario: Acessar o item de vagas de tecnologia
  #   Dado que eu estou no site da accenture
  #   E fechar o cookie
  #   E clico no menu carreiras
  #   E clico no item do menu vagas em tecnologia
  #   Entao devo ver o destaque "Carreiras em tecnologia"

  Cenario: Procurando uma vaga 
    Dado que eu estou no site da accenture 
    E fechar o cookie
    E digito no campo de busca "desenvolvedor" 
    E clico no botao procurar 
    Entao devo encontrar vagas para programadores 


