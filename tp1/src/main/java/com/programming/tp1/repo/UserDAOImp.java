package com.programming.tp1.repo;

import com.programming.tp1.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class UserDAOImp implements UsuarioDAO{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Usuario> obtenerUsuarios() {
        String query = "SELECT u FROM Usuario u";
        return entityManager.createQuery(query).getResultList();
    }

}
