package com.example.Projeto.Controller;

import com.example.Projeto.Model.ProfissionalModel;
import com.example.Projeto.Service.ProfissionalService;
import org.springframework.web.bind.annotation.*;
import lombok.AllArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/profissional")
public class ProfissionalController {
    private final ProfissionalService ProfissionalService;

    public ProfissionalController(ProfissionalService ProfissionalService) {
        this.ProfissionalService = ProfissionalService;
    }
    @GetMapping
    public List<ProfissionalModel> listarProfissionais() {
        return ProfissionalService.listarProfissionais();
    }
    @PostMapping
    public ProfissionalModel salvarProfissionais(@RequestBody ProfissionalModel ProfissionalModel) {
        return ProfissionalService.salvarProfissionais(ProfissionalModel);
    }
    @DeleteMapping("/{id}")
    public void deletar_profissionais(@PathVariable Long id) {
        ProfissionalService.deletar_profissional(id);
    }
}

