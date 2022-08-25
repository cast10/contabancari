package com.contabancaria.ContaBancaria.Model.negociacao;

import com.contabancaria.ContaBancaria.Model.ContaModel;

import java.math.BigDecimal;

public interface CalcularValorConta {

    BigDecimal calcular (ContaModel contaModel);
}
