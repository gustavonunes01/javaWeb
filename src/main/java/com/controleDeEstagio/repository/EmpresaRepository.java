package com.controleDeEstagio.repository;

import org.springframework.data.repository.CrudRepository;
import com.controleDeEstagio.models.Empresa;

public interface EmpresaRepository extends CrudRepository<Empresa, String> {

}
