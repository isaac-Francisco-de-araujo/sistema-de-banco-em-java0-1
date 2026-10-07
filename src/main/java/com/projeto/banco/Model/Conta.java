package com.projeto.banco.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name="Conta")
@Getter
@NoArgsConstructor

public class Conta{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable=false, unique=true)
private Long id_cliente;

@Column(nullable=false)
private float saldo;

@Column(nullable=false)
private float valor_saque;

@Column(nullable=false)
private float valor_deposito;
}