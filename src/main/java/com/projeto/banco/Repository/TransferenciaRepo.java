package com.projeto.banco.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.banco.Model.Transferencia;

public interface TransferenciaRepo extends JpaRepository<Transferencia, Long> {

}