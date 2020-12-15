package com.osterloh.agendacontatos.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import static lombok.AccessLevel.PRIVATE;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = PRIVATE)
@Table(name = "TB_CONTATO")
public class Contato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String nome;
    String sobrenome;
    String telefone;
    String endereco;
    String email;

}
