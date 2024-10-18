package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;
import lombok.Data;


@Data 
public class ProdutoResponseDto {
    private Long id; 
    private String nome; 
    private BigDecimal valor; 

    public ProdutoResponseDto() {
    }

    public ProdutoResponseDto(Long id, String nome, BigDecimal valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }
}