 # language: pt

 Funcionalidade: Gerenciamento de um usuario na Petstore

   Cenario: Criar usuario na loja
   @focus
   Cenario: Criar usuário na loja refletindo o negócio
     Quando crio um usuário
     Então o usuário é salvo no sistema