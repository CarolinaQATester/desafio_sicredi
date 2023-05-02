#language: pt

Funcionalidade: Criar Simulacao


  Cenario: deve realizar um cadastro com sucesso
    Dado eu realizo um cadastro uma nova simulacao
    Entao valido seu retorno

  Cenario: dever realizar um cadastro com campo obrigatório VALOR em cadastro de nova simulação
    Dado eu realizo um cadastro uma nova simulacao
    Quando insiro o valor nulo
    Entao valido seu retorno

  Cenario: dever realizar um cadastro com cpf cadastrado
    Dado eu realizo um cadastro uma nova simulacao
    Quando inserir dados para cadastro de simulação com CPF já cadastrado
    Então deve validar mensangem "CPF já existente"
