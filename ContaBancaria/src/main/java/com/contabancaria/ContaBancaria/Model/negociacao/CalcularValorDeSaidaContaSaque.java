package com.contabancaria.ContaBancaria.Model.negociacao;

import com.contabancaria.ContaBancaria.Model.ContaModel;

import java.math.BigDecimal;

public class CalcularValorDeSaidaContaSaque implements CalcularValorConta {

    @Override
    public BigDecimal calcular (ContaModel contaModel){
    return contaModel.getValorAtualnaConta().subtract(contaModel.getValorSaqueOUDeposito());
    }
}