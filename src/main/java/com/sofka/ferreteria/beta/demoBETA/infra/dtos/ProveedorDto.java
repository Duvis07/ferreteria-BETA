package com.sofka.ferreteria.beta.demoBETA.infra.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document
@Builder(toBuilder = true)
public class ProveedorDto {

    private String id;
    private String fechaAsociacion;
    private String nombre;
    private String telefono;
    private String dni;
    private List<String> productosOfrecidos;
}

