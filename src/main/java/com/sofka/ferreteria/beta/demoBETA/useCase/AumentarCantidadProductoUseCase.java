package com.sofka.ferreteria.beta.demoBETA.useCase;


import com.google.gson.Gson;
import com.sofka.ferreteria.beta.demoBETA.infra.data.ProductoAñadir;
import com.sofka.ferreteria.beta.demoBETA.infra.mapper.ProductoMapper;
import com.sofka.ferreteria.beta.demoBETA.infra.repository.ProductoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
@Slf4j
public class AumentarCantidadProductoUseCase implements Consumer<String> {

    private final ProductoRepository repository;
    private final ProductoMapper mapper;
    private final Gson gson = new Gson();

    public AumentarCantidadProductoUseCase(ProductoRepository repository, ProductoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void accept(String recibido) {
        ProductoAñadir productoAñadir = gson.fromJson(recibido, ProductoAñadir.class);
        repository.findById(productoAñadir.getIdProducto())
                .map(productoData -> mapper.productoDataAModelo(productoData))
                .map(producto -> producto.aumentarCantidad(productoAñadir.getCantidad()))
                .flatMap(producto -> {
                    System.out.println("*****");
                    System.out.println(producto.toString());
                    return repository.save(mapper.productoModeloAData(producto));
                })
                .subscribe(productoData -> log.info(productoData.toString()));
    }
}
