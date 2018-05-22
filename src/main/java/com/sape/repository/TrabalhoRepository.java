package com.sape.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sape.model.Trabalho;

@RepositoryRestResource(path = "trabalhos", collectionResourceRel = "trabalhos")
public interface TrabalhoRepository extends JpaRepository<Trabalho, Long>{

}
