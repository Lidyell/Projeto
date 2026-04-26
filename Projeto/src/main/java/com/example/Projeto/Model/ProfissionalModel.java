package com.example.Projeto.Model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "profissionais")
@Setter
@Getter
public class ProfissionalModel {
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
