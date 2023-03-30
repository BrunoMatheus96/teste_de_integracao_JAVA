 # language: pt

 Funcionalidade: Gerenciamento de um usuario na Petstore

   Cenario: Criar usuario na loja
     Quando eu faco um POST com os segunites valores:
       | id         | 10               |
       | username   | rafael           |
       | firstName  | Rafael           |
       | lastName   | Lima             |
       | email      | rafael@gmail.com |
       | password   | 12345            |
       | phone      | 995317250        |
       | userStatus | 0                |
     Entao quando faco um GET para /rafael, o usuario criado nao e retornado

   @focus
   Cenario: Criar usuário na loja refletindo o negócio
     Quando crio um usuário
     Então o usuário é salvo no sistema