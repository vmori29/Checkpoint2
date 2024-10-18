package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoRequestUpdateDto {
    private String nome;
    private BigDecimal valor;

    public ProdutoRequestUpdateDto() {
    }

    public ProdutoRequestUpdateDto(String nome, BigDecimal valor) {
        this.nome = nome;
        this.valor = valor;
    }
}