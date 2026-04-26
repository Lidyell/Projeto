package com.example.Projeto.Repository;

import com.example.Projeto.Model.ProfissionalModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfissionalRepository extends JpaRepository<ProfissionalModel, Long> {
}
