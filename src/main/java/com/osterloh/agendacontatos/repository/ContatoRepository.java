package com.osterloh.agendacontatos.repository;

import com.osterloh.agendacontatos.models.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
    Contato findById(UUID id);
}
