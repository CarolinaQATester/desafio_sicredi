#language: pt

Funcionalidade: Consultar uma restrição pelo CPF

  Contexto: Criar consultas

  Cenario: Verificar se o CPF sem restricao
    Quando eu faço consulto o CPF sem restricao
    Entao valido seu retorno

  Esquema do Cenario:  Verifier se o CPF possui restrição
    Quando eu faço um GET para consultar com os seguntes CPF
      | CPF   |
      | <CPF> |
    Entao valido seu retorno o status
    E mensagem O CPF <CPF> tem problema
    Exemplos:
      | CPF         |
      | 97093236014 |
      | 60094146012 |
      | 84809766080 |
      | 62648716050 |
      | 26276298085 |
      | 01317496094 |
      | 55856777050 |
      | 19626829001 |
      | 24094592008 |
      | 58063164083 |