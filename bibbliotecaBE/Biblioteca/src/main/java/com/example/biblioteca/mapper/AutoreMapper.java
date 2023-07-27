package com.example.biblioteca.mapper;

import com.example.biblioteca.dto.AutoreDTO;
import com.example.biblioteca.entities.AutoreEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoreMapper {
    AutoreMapper AUTORE_MAPPER = Mappers.getMapper(AutoreMapper.class);

    @Mapping(source = "idAutore", target = "idAutore")
    @Mapping(source = "nomeAutore", target = "nomeAutore")
    @Mapping(source = "nazionalitaAutore", target = "nazionalitaAutore")
    AutoreDTO entityToDto(AutoreEntity autoreEntity);

    @Mapping(source = "idAutore", target = "idAutore")
    @Mapping(source = "nomeAutore", target = "nomeAutore")
    @Mapping(source = "nazionalitaAutore", target = "nazionalitaAutore")
    AutoreEntity dtoToEntity(AutoreDTO autoreDTO);
}
