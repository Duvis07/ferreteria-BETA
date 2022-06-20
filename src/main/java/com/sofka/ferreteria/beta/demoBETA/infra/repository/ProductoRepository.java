package com.sofka.ferreteria.beta.demoBETA.infra.repository;


import com.sofka.ferreteria.beta.demoBETA.infra.data.ProductoData;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends ReactiveMongoRepository<ProductoData, String> {
}
