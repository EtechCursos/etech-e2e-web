#language: pt
#enconding: UTF-8
#author: E.tech Cursos
#version: 1.0

@logout
Funcionalidade: Logout
  Com essa funcionalidade iremos realizar o logout de um usuário cadastrado na aplicação

  Como um usuário cadastrado
  Eu preciso clicar no campo "Sair"
  Para o logout ser efetuado com sucesso

  Contexto: Entrar na tela de login
    Dado estiver na tela de login
    E inserir os dados do usuário
      | email               | senha     |
      | automacao@etech.dev | Etech@123 |

  @logout @smokeTest
  Cenário: Validar o logout na aplicação
    Quando realizar o logout
    Então devo realizar o logout com sucesso