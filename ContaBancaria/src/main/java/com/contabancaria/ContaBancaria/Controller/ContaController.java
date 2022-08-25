package com.contabancaria.ContaBancaria.Controller;

import com.contabancaria.ContaBancaria.Model.ContaModel;
import com.contabancaria.ContaBancaria.Model.negociacao.ContaFactory;
import com.contabancaria.ContaBancaria.Service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContaController {

    @Autowired
    ContaService contaService;

    @GetMapping (path = "/conta")
    public List <ContaModel> buscarDeposito (){
        return contaService.buscarTodos();
    }

    @GetMapping (path = "/conta/{codido}")
    public Optional<ContaModel>burscarDepositoporId (@PathVariable long codigo){
        return contaService.buscarPorId(codigo);
    }
    @PostMapping(path = "/conta")
        public ContaModel cadastrarDeposito(@RequestBody ContaModel contaModel, ContaFactory contaFactory){
            return  contaService.cadastraConta(contaModel, contaFactory);
    }

    @DeleteMapping(path = "/conta/{codigo}")
    public void deletarDeposito(@PathVariable Long codigo){
        contaService.deleteDeposito(codigo);
     }
}
