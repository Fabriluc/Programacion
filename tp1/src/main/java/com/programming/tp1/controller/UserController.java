package com.programming.tp1.controller;

import com.programming.tp1.model.Usuario;
import com.programming.tp1.repo.UsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UsuarioDAO usuarioDAO;
    @GetMapping

    public List<Usuario> getDatabaseUsers() {
        return usuarioDAO.obtenerUsuarios();
    }


}
