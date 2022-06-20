package com.sofka.ferreteria.beta.demoBETA.infra.config;

import com.sofka.ferreteria.beta.demoBETA.useCase.AumentarCantidadProductoUseCase;
import com.sofka.ferreteria.beta.demoBETA.useCase.RecibirProductoYGuardarUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class RabbitConfig {

    public final static String CREAR_PRODUCTO_QUEUE = "action.crear.producto";
    public final static String AUMENTAR_PRODUCTO_QUEUE = "action.aumentar.producto";

    @Autowired
    private RecibirProductoYGuardarUseCase recibirProductoYGuardarUseCase;

    @Autowired
    private AumentarCantidadProductoUseCase aumentarCantidadProductoUseCase;

    @RabbitListener(queues = CREAR_PRODUCTO_QUEUE)
    public void escucharColaParaGuardarProducto(String recibido){
        log.info(recibido);
        recibirProductoYGuardarUseCase.accept(recibido);
    }

    @RabbitListener(queues = AUMENTAR_PRODUCTO_QUEUE)
    public void escucharColaAumentarproducto(String recibido){
        log.info(recibido);
        aumentarCantidadProductoUseCase.accept(recibido);
    }


}
