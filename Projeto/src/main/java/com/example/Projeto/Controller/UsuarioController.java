package com.example.Projeto.Controller;

import com.example.Projeto.Model.UsuarioModel;
import com.example.Projeto.Service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:5173")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @GetMapping
    public List<UsuarioModel> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }
    @PostMapping
    public UsuarioModel salvarusuario(@RequestBody UsuarioModel usuarioModel) {
        return usuarioService.salvarusuario(usuarioModel);
    }
    @DeleteMapping("/{id}")
    public void deletar_usuario(@PathVariable Long id) {
        usuarioService.deletar_usuario(id);
    }

    @PostMapping("/login")
    public UsuarioModel login(@RequestBody UsuarioModel usuario) {
        return usuarioService.login(usuario.getEmail(), usuario.getSenha());
    }
}
