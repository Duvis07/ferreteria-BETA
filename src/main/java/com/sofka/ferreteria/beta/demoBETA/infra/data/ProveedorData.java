package com.sofka.ferreteria.beta.demoBETA.infra.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document
@Builder(toBuilder = true)
public class ProveedorData {

    @Id
    private String id;
    private String fechaAsociacion;
    private String nombre;
    private String telefono;
    private String dni;
    private List<String> productosOfrecidos;
}
