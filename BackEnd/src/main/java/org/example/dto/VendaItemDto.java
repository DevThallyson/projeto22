package org.example.dto;

import java.math.BigDecimal;

public class VendaItemDto {

    private Long produtoId;
    private Integer quantidade;
    private BigDecimal precoUnitario;

    public VendaItemDto() {
    }

    // Getters e setters
    public Long getProdutoId() { return produtoId; }
    public void setProdutoId(Long produtoId) { this.produtoId = produtoId; }

    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }

    public BigDecimal getPrecoUnitario() { return precoUnitario; }
    public void setPrecoUnitario(BigDecimal precoUnitario) { this.precoUnitario = precoUnitario; }
}
