 # language: pt

 Funcionalidade: Gerenciamento de um usuario na Petstore
   @all
   @focus
   Cenario: Lista somente animais disponiveis para a venda
     Dado que eu possua animais disponíveis
     Quando eu pesquiso todos os animais disponíveis
     Então eu recebo a lista de animais disponpiveis