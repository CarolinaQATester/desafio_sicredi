#language: pt

Funcionalidade: Deletar Simulacao


  Cenario: deve remover um cadastro com sucesso
    Dado que eu tenha um cadastro
    Quando realizo a exclusao de uma simulacao
    Entao valido seu retorno

  Cenario: dever remover um cadastro que já foi excluido
    Dado que eu tenho id que foi excluido
    Quando e tento excluir novamente
    Entao valido seu retorno


