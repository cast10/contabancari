package com.contabancaria.ContaBancaria.Repository;

import com.contabancaria.ContaBancaria.Model.ContaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<ContaModel, Long> {
}

