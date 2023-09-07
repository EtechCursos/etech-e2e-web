#language: pt
#enconding: UTF-8
#author: Enzo Garcia Rodrigues
#date: 11/05/2023
#version: 1.0

Funcionalidade: Login
  Com essa funcionalidade iremos realizar o login de um usuário cadastrado na aplicação

  Como um usuário cadastrado
  Eu preciso inserir dados cadastrais
  Para o login ser efetuado com sucesso

  Contexto: Entrar na tela de login
    Dado estiver na tela de login

  @smokeTest @loginAplicacao
  Cenário: Validar o login na aplicação
    Quando inserir os dados do usuário
      | email                    | senha    |
      | enzikagarcia10@gmail.com | teste123 |
    Então devo visualizar o campo "Enzo Garcia"