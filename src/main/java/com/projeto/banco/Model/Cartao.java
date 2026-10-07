package com.projeto.banco.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name="Cartao")
@Getter
@NoArgsConstructor

public class Cartao{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false, unique = true)
private String titular;

@Column(nullable = false, unique = false)
private String cpf;

@Column(nullable = false)
private String tipo_cartao;

@Column(nullable = false)
private String bandeira;

@Column(nullable = false)
private float renda_informada;

@Column(nullable = false)
private String endereco_entrega;

@Column(nullable = false)
private float limite;

@Column(nullable = false)
private String numero_cartao;

@Column(nullable = false)
private Date data_validade;

@Column(nullable = false)
private int cvv;

@Column(nullable = false)
private String agencia;

@Column(nullable = false)
private String conta;

@Column(nullable = false, unique = true)
private String codigo;

@Column(nullable = false)
private Date data_solicitacao;

@Column(nullable = false)
private String status_pedido;

@Column(nullable = false)
private int codigo_rastreio;
}
