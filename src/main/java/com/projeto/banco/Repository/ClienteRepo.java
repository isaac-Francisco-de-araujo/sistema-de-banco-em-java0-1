package com.projeto.banco.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.banco.Model.Cliente;

public interface ClienteRepo extends JpaRepository<Cliente, Long> {

}