package com.contabancaria.ContaBancaria.Model.negociacao;

import org.springframework.stereotype.Component;

@Component
public class ContaFactory {

    public CalcularValorConta calcularValorConta(String tipoDeNegociacao) {
        if (tipoDeNegociacao.equalsIgnoreCase("Valor Depositado")) {
            return new CalcularValorParaContaDeposito();
        } else if (tipoDeNegociacao.equalsIgnoreCase("Valor Retirado ou Saqueado")) {
            return new CalcularValorDeSaidaContaSaque();
        } else {
            return null;
        }
    }
}
