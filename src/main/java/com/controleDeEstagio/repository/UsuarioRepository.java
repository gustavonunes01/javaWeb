package com.controleDeEstagio.repository;

import org.springframework.data.repository.CrudRepository;

import com.controleDeEstagio.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{
	Usuario findByLogin(String login);

}
