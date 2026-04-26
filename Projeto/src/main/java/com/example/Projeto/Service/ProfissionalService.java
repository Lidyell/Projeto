package com.example.Projeto.Service;
import java.util.*;

import com.example.Projeto.Model.ProfissionalModel;
import com.example.Projeto.Model.UsuarioModel;
import com.example.Projeto.Repository.ProfissionalRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfissionalService {
    private final ProfissionalRepository ProfissionalRepository;

    public ProfissionalService(ProfissionalRepository profissionalRepository) {
        this.ProfissionalRepository = profissionalRepository;
    }

    public List<ProfissionalModel> listarProfissionais() {
        return ProfissionalRepository.findAll();
    }

    public ProfissionalModel salvarProfissionais(ProfissionalModel ProfissionalModel) {
        return ProfissionalRepository.save(ProfissionalModel);
    }

    public void deletar_profissional(Long id) {
        ProfissionalRepository.deleteById(id);
    }
}
