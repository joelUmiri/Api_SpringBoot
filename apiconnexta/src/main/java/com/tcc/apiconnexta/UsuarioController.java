package com.tcc.apiconnexta;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final List<Usuario> usuarios = new ArrayList<>();

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    // POST → usado pra ENVIAR dados pra API
    @PostMapping
    public String cadastrarUsuario(@RequestBody Usuario usuario) {
        usuarios.add(usuario);

        // Aqui podemos simular o que aconteceria com o usuário enviado: (Mostra no terminal)
        System.out.println("Nome recebido: " + usuario.getNome());
        System.out.println("Email recebido: " + usuario.getEmail());

        return "Usuário cadastrado com sucesso!";
    }
}

