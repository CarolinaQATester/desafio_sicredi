#language: pt

Funcionalidade: Buscar Todas Simulacoes

  Cenario: Buscar Simulacoes
    Dado que eu realize um consulta
    Quando realizo a consulta
    Entao valido o retorno da consulta


  Cenario: Realizar Busca sem Simulacao
    Dado que eu realize um consulta
      Quando realizo a consulta
      Entao valido o status 204 nao existe simulacao