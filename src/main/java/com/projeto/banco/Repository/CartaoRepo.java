package com.projeto.banco.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.banco.Model.Cartao;

public interface CartaoRepo extends JpaRepository<Cartao, Long> {

}