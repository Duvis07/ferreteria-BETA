package com.sofka.ferreteria.beta.demoBETA.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder(toBuilder = true)
@RequiredArgsConstructor
@AllArgsConstructor
public class Producto {

    private String id;
    private String fechaCreacion;
    private String nombre;
    private double precio;
    private int unidadesDisponibles;
    private int maximoUnidades;
    private int minimoUnidades;
    private Proveedor proveedor;


    public Producto aumentarCantidad(int cantidad){
        this.unidadesDisponibles = this.unidadesDisponibles + cantidad;
        return this;
    }
}
