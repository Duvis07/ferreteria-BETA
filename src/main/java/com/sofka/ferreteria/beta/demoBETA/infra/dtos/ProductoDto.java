package com.sofka.ferreteria.beta.demoBETA.infra.dtos;


import com.sofka.ferreteria.beta.demoBETA.domain.Proveedor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ProductoDto {

    private String id;
    private String fechaCreacion;
    private String nombre;
    private double precio;
    private int unidadesDisponibles = 0;
    private int maximoUnidades;
    private int minimoUnidades;
    private Proveedor proveedor;
}
