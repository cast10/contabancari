package com.contabancaria.ContaBancaria.Service;

import com.contabancaria.ContaBancaria.Model.ContaModel;
import com.contabancaria.ContaBancaria.Model.negociacao.CalcularValorConta;
import com.contabancaria.ContaBancaria.Model.negociacao.ContaFactory;
import com.contabancaria.ContaBancaria.Repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    @Autowired
    private ContaFactory contaFactory;

    public List<ContaModel> buscarTodos() {
        return contaRepository.findAll();
    }

    public Optional<ContaModel> buscarPorId(long codigo) {
        return contaRepository.findById(codigo);
    }

    public ContaModel cadastraConta(ContaModel contaModel, ContaFactory contaFactory) {
        contaModel.getNumeroAgencia();
        contaModel.getNumeroConta();
        contaModel.getNomeUsuario();
        contaModel.getValorAtualnaConta();
        contaModel.getValorSaqueOUDeposito();
        contaModel.setValorFinal(contaFactory.calcularValorConta(contaModel.getTipoDeTransação()).calcular(contaModel));

        return contaRepository.save(contaModel);
    }

    public void deleteDeposito(Long codigo) {
        contaRepository.deleteById(codigo);
    }

    public ContaModel negociacaoBancaria(ContaModel contaModel) {
        CalcularValorConta calcularValorConta = contaFactory.calcularValorConta(contaModel.getTipoDeTransação());
        contaModel.setValorAtualnaConta(calcularValorConta.calcular(contaModel));
        return contaRepository.save(contaModel);

    }
}