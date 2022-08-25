package com.contabancaria.ContaBancaria.Model;

import lombok.*;
import org.springframework.boot.web.reactive.context.GenericReactiveWebApplicationContext;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.logging.Level;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name =  "conta")

public class ContaModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idcodigo;

    @Column(length = 10, nullable = false)
    private String numeroConta;

    @Column(length = 10, nullable = false)
    private String numeroAgencia;

    @Column(length = 50, nullable = false)
    private String nomeUsuario;

    @Column(length = 10, nullable = false)
    private String tipoDeTransação;

    @Column(length = 15, nullable = false)
    private BigDecimal valorAtualnaConta;

    @Column(length = 15, nullable = false)
    private BigDecimal valorFinal;

    @Column(length = 15, nullable = false)
    private BigDecimal valorSaqueOUDeposito;


}
