package com.sape.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sape.model.Comissao;

@RepositoryRestResource(path = "comissoes", collectionResourceRel = "comissoes")
public interface ComissaoRepository extends JpaRepository<Comissao, Long>{

}
