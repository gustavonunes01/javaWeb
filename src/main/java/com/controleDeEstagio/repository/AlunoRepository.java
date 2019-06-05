package com.controleDeEstagio.repository;

import org.springframework.data.repository.CrudRepository;
import com.controleDeEstagio.models.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, String> {

}
