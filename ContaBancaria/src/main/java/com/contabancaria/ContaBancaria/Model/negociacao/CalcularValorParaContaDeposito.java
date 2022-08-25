package com.contabancaria.ContaBancaria.Model.negociacao;

import com.contabancaria.ContaBancaria.Model.ContaModel;


import java.math.BigDecimal;

public class CalcularValorParaContaDeposito implements CalcularValorConta {

    @Override
    public BigDecimal calcular (ContaModel contaModel){
    return contaModel.getValorAtualnaConta().add(contaModel.getValorSaqueOUDeposito());
    }
}