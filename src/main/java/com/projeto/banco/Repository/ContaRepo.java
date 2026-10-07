package com.projeto.banco.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.banco.Model.Conta;

public interface ContaRepo extends JpaRepository<Conta, Long> {

}
