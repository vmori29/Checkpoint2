package br.com.fiap.ecommerce.dtos;

import lombok.Data;
import org.modelmapper.ModelMapper;
import br.com.fiap.ecommerce.model.Cliente;

@Data 
public class ClienteRequestUpdateDto {

    private String nome;
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String municipio;
    private String uf;

    private static final ModelMapper modelMapper = new ModelMapper();

    public Cliente toModel(Long id) {
        Cliente result = modelMapper.map(this, Cliente.class);
        result.setId(id); 
        return result;
    }  
}