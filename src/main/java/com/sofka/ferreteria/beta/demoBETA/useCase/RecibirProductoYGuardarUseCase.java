package com.sofka.ferreteria.beta.demoBETA.useCase;

import com.google.gson.Gson;
import com.sofka.ferreteria.beta.demoBETA.infra.data.ProductoData;
import com.sofka.ferreteria.beta.demoBETA.infra.dtos.ProductoDto;
import com.sofka.ferreteria.beta.demoBETA.infra.mapper.ProductoMapper;
import com.sofka.ferreteria.beta.demoBETA.infra.repository.ProductoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
@Slf4j
public class RecibirProductoYGuardarUseCase implements Consumer<String> {

    private final ProductoMapper mapper;
    private final ProductoRepository repository;
    private final Gson gson = new Gson();

    public RecibirProductoYGuardarUseCase(ProductoMapper mapper, ProductoRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }


    @Override
    public void accept(String recibido) {
        ProductoDto productoDto = gson.fromJson(recibido, ProductoDto.class);
        repository.save(mapper.productoDtoAData(productoDto)).subscribe(productoData -> log.info(productoData.toString()));
    }
}
