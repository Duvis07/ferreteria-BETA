package com.sofka.ferreteria.beta.demoBETA.infra.dtos;

import com.sofka.ferreteria.beta.demoBETA.domain.Proveedor;
import com.sofka.ferreteria.beta.demoBETA.infra.data.ProductoAñadir;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ReciboDto {

    private String id;

    private ProductoAñadir productoAñadir;

    private String fechaIngreso;

    private Proveedor proveedor;
}
