package com.catallogic.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record ProdutoDTO(
    @NotBlank(message = "O nome do produto é obrigatório")
    String nome,
    
    String descricao,
    
    @NotNull(message = "O preço é obrigatório")
    @Positive(message = "O preço deve ser maior que zero")
    Double preco,
    
    @NotNull(message = "A quantidade em estoque é obrigatória")
    Integer quantidadeEstoque
) {}