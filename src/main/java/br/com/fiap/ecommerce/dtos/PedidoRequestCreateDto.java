package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;
import org.modelmapper.ModelMapper;
import br.com.fiap.ecommerce.model.Pedido;

@Data 
public class PedidoRequestCreateDto {
    
    private Long idCliente;
    private LocalDate dataPedido;
    private String status;
    private String formaPagamento;
    private BigDecimal valorTotal;

    private static final ModelMapper modelMapper = new ModelMapper();

    public Pedido toModel() {
        return modelMapper.map(this, Pedido.class);
    }
}