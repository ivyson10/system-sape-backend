package com.sape.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sape.model.Instituicao;

@RepositoryRestResource(path = "instituicoes", collectionResourceRel = "instituicoes")
public interface InstituicaoRepository extends JpaRepository<Instituicao, Long>{

}
