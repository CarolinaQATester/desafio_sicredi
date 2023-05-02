package com.sicredi.suporte.domain;

import lombok.Builder;
import lombok.Data;

@Data
public class Simulacao {
    @Builder.Default
    private String nome;
    @Builder.Default
    private String cpf;
    @Builder.Default
    private String email;
    @Builder.Default
    private double valor;
    @Builder.Default
    private int parcela;
    @Builder.Default
    private Boolean seguro;
}

