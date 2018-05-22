package com.sape.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sape.model.Autor;

@RepositoryRestResource(path = "autores", collectionResourceRel = "autores")
public interface AutorRepository extends JpaRepository<Autor, Long> {

}
