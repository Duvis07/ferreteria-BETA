package com.sofka.ferreteria.beta.demoBETA.infra.route;


import com.sofka.ferreteria.beta.demoBETA.infra.dtos.ProductoDto;
import com.sofka.ferreteria.beta.demoBETA.infra.dtos.ProveedorDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.function.Function;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RutasFerreteria {



}
