package com.projeto.banco.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name="Notificacao")
@Getter
@NoArgsConstructor

public class Notificacao{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false)
private Long id_cliente;

@Column(nullable = false)
private String tipo_notificacao;

@Column(nullable = false)
private String mensagem;
}
