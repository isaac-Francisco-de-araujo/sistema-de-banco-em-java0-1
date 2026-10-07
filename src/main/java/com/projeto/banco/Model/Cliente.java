package com.projeto.banco.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name="tb_clientes")
@Getter
@NoArgsConstructor

public class Cliente{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable=false)
private String nome;

@Column(nullable=false, unique=true)
private String email;

@Column(nullable=false)
private String senha;

@Column(nullable=false, unique=true)
private String cpf;

@Column(nullable=false, unique=true)
private String telefone;

}