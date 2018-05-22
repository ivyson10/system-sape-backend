package com.sape.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sape.model.Evento;
@RepositoryRestResource(path = "eventos", collectionResourceRel = "eventos")
public interface EventoRepository extends JpaRepository<Evento, Long> {

}
