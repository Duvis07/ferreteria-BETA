package com.sofka.ferreteria.beta.demoBETA.infra.repository;


import com.sofka.ferreteria.beta.demoBETA.infra.data.ProveedorData;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends ReactiveMongoRepository<ProveedorData, String> {
}
