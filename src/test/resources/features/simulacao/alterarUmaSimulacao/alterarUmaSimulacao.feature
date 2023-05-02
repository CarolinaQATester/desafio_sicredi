#language: pt

Funcionalidade: Alterar Simulacao


  Cenario: deve realizar uma alteracao no sucesso
    Dado eu realizo um cadastro uma nova simulacao
    Entao valido seu retorno


  Cenario: dever realizar alteracao no cpf que não tem simulacao
    Dado eu realizo um cadastro uma nova simulacao
    Quando insiro o valor cpf que não tem uma simulacao
    Entao valido seu retorno
    E mensagem "CPF não encontrado"