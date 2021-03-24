# language: pt

Funcionalidade: Validar CPF
    Cenario: CPF Valido
        Dado que eu esteja na pagina de validação de CPF
        E digito o CPF válido "093.160.114-26"
        Quando eu clico no botão enviar
        Entao devo ver uma mensagem de "CPF validado com sucesso"

    Cenario: CPF Invalido
        Dado que eu esteja na pagina de validação de CPF
        E digito o CPF válido "093.160.114-29"
        Quando eu clico no botão enviar
        Entao devo ver uma mensagem de "CPF Invalido"