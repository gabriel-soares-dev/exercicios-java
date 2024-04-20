package com.onegss.poe.data;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoData {

    private String codigo;
    private String nomeProduto;
    private BigDecimal valor;

}
