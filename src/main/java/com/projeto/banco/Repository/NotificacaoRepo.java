package com.projeto.banco.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.banco.Model.Notificacao;

public interface NotificacaoRepo extends JpaRepository<Notificacao, Long> {

}