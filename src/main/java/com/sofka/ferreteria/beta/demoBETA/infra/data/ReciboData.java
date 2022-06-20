package com.sofka.ferreteria.beta.demoBETA.infra.data;


import com.sofka.ferreteria.beta.demoBETA.domain.Proveedor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class ReciboData {

    @Id
    private String id;

    private ProductoAñadir productoAñadir;

    private String fechaIngreso;

    private Proveedor proveedor;
}
