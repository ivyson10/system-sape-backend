package com.sape.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sape.model.Notas;

@RepositoryRestResource(path = "notas", collectionResourceRel = "notas")
public interface NotasRepository extends JpaRepository<Notas, Long>{

}
