package com.sofka.ferreteria.beta.demoBETA.infra.data;

import com.sofka.ferreteria.beta.demoBETA.domain.Proveedor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@RequiredArgsConstructor
public class ProductoData {

    @Id
    private String id;
    private String fechaCreacion;
    private String nombre;
    private double precio;
    private int unidadesDisponibles = 0;
    private int maximoUnidades;
    private int minimoUnidades;
    private Proveedor proveedor;

    @Override
    public String toString() {
        return "ProductoData{" +
                "id='" + id + '\'' +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", unidadesDisponibles=" + unidadesDisponibles +
                ", maximoUnidades=" + maximoUnidades +
                ", minimoUnidades=" + minimoUnidades +
                ", proveedor=" + proveedor +
                '}';
    }
}
