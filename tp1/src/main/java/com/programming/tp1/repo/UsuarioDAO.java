package com.programming.tp1.repo;

import com.programming.tp1.model.Usuario;
import jakarta.transaction.Transactional;

import java.util.List;


public interface UsuarioDAO {
    List<Usuario> obtenerUsuarios();


}
