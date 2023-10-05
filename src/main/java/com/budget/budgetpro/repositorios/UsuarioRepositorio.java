package com.budget.budgetpro.repositorios;

import com.budget.budgetpro.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, String>{
    
}
