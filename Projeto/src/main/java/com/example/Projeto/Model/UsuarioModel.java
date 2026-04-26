package com.example.Projeto.Model;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@Table(name = "usuarios")
public class UsuarioModel {

    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "nome", nullable = false)
        private String nome;

        @Column(name = "email", nullable = false, unique = true)
        private String email;

        @Column(name = "senha", nullable = false)
        private String senha;

}


