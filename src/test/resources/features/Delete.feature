#language: pt
#encoding: UTF-8
#author: Fernanda Kubayashi


  Funcionalidade: Deletar usuário

    @web @apagar1
    Cenario: Validar mensagem de sucesso ao deletar um usuário

      Dado que acesso a pagina de lista de usuários
      E estou realizando o teste
        | Numero do CT |                          Nome do CT            | Nome do executor   | Sprint   |
        | 123-XXX      |         Descricao com o nome do caso de teste  |  Marcos Barbosa    | Sprint 3 |
      E busco pelo nome a ser deletado
      Entao visualizo a mensagem de delete "Seu Usuário foi removido com sucesso!"
