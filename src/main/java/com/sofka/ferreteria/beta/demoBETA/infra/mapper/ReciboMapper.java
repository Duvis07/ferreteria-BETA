package com.sofka.ferreteria.beta.demoBETA.infra.mapper;

import com.sofka.ferreteria.beta.demoBETA.infra.data.ReciboData;
import com.sofka.ferreteria.beta.demoBETA.infra.dtos.ReciboDto;
import org.springframework.stereotype.Component;

@Component
public class ReciboMapper {

    public ReciboData deReciboDtoAData(ReciboDto reciboDto){
        var reciboData = new ReciboData();
        reciboData.setId(reciboDto.getId());
        reciboData.setProductoAñadir(reciboDto.getProductoAñadir());
        reciboData.setFechaIngreso(reciboDto.getFechaIngreso());
        reciboData.setProveedor(reciboDto.getProveedor());
        return reciboData;
    }

    public ReciboDto deReciboDataADto(ReciboData reciboData){
        var reciboDto = new ReciboDto();
        reciboDto.setId(reciboData.getId());
        reciboDto.setProductoAñadir(reciboData.getProductoAñadir());
        reciboDto.setFechaIngreso(reciboData.getFechaIngreso());
        reciboDto.setProveedor(reciboData.getProveedor());
        return reciboDto;
    }

}
