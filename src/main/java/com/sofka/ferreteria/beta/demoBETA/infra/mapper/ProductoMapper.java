package com.sofka.ferreteria.beta.demoBETA.infra.mapper;

import com.sofka.ferreteria.beta.demoBETA.domain.Producto;
import com.sofka.ferreteria.beta.demoBETA.infra.data.ProductoData;
import com.sofka.ferreteria.beta.demoBETA.infra.dtos.ProductoDto;
import org.springframework.stereotype.Component;

@Component
public class ProductoMapper {

    public ProductoData productoDtoAData(ProductoDto productoDto){
        var productoData = new ProductoData();
        productoData.setFechaCreacion(productoDto.getFechaCreacion());
        productoData.setId(productoDto.getId());
        productoData.setPrecio(productoDto.getPrecio());
        productoData.setProveedor(productoDto.getProveedor());
        productoData.setNombre(productoDto.getNombre());
        productoData.setUnidadesDisponibles(productoDto.getUnidadesDisponibles());
        productoData.setMaximoUnidades(productoDto.getMaximoUnidades());
        productoData.setMinimoUnidades(productoDto.getMinimoUnidades());
        return productoData;
    }

    public Producto productoDtoAModelo(ProductoDto productoDto){
        var producto = new Producto();
        producto.setFechaCreacion(productoDto.getFechaCreacion());
        producto.setId(productoDto.getId());
        producto.setPrecio(productoDto.getPrecio());
        producto.setProveedor(productoDto.getProveedor());
        producto.setNombre(productoDto.getNombre());
        producto.setUnidadesDisponibles(productoDto.getUnidadesDisponibles());
        producto.setMaximoUnidades(productoDto.getMaximoUnidades());
        producto.setMinimoUnidades(productoDto.getMinimoUnidades());
        return producto;
    }

    public ProductoData productoModeloAData(Producto producto){
        var productoData = new ProductoData();
        productoData.setFechaCreacion(producto.getFechaCreacion());
        productoData.setId(producto.getId());
        productoData.setPrecio(producto.getPrecio());
        productoData.setProveedor(producto.getProveedor());
        productoData.setNombre(producto.getNombre());
        productoData.setUnidadesDisponibles(producto.getUnidadesDisponibles());
        productoData.setMaximoUnidades(producto.getMaximoUnidades());
        productoData.setMinimoUnidades(producto.getMinimoUnidades());
        return productoData;
    }

    public ProductoDto productoModeloADto(Producto producto){
        var productoDto = new ProductoDto();
        productoDto.setFechaCreacion(producto.getFechaCreacion());
        productoDto.setId(producto.getId());
        productoDto.setPrecio(producto.getPrecio());
        productoDto.setProveedor(producto.getProveedor());
        productoDto.setNombre(producto.getNombre());
        productoDto.setUnidadesDisponibles(producto.getUnidadesDisponibles());
        productoDto.setMaximoUnidades(producto.getMaximoUnidades());
        productoDto.setMinimoUnidades(producto.getMinimoUnidades());
        return productoDto;
    }

    public ProductoDto productoDataADto(ProductoData productoData){
        var productoDto = new ProductoDto();
        productoDto.setFechaCreacion(productoData.getFechaCreacion());
        productoDto.setId(productoData.getId());
        productoDto.setPrecio(productoData.getPrecio());
        productoDto.setProveedor(productoData.getProveedor());
        productoDto.setNombre(productoData.getNombre());
        productoDto.setUnidadesDisponibles(productoData.getUnidadesDisponibles());
        productoDto.setMaximoUnidades(productoData.getMaximoUnidades());
        productoDto.setMinimoUnidades(productoData.getMinimoUnidades());
        return productoDto;
    }

    public Producto productoDataAModelo(ProductoData productoData){
        var producto = new Producto();
        producto.setFechaCreacion(productoData.getFechaCreacion());
        producto.setId(productoData.getId());
        producto.setPrecio(productoData.getPrecio());
        producto.setProveedor(productoData.getProveedor());
        producto.setNombre(productoData.getNombre());
        producto.setUnidadesDisponibles(productoData.getUnidadesDisponibles());
        producto.setMaximoUnidades(productoData.getMaximoUnidades());
        producto.setMinimoUnidades(productoData.getMinimoUnidades());
        return producto;
    }
}
