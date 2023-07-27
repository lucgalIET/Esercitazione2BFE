package com.example.biblioteca.mapper;

import com.example.biblioteca.dto.EditoreDTO;
import com.example.biblioteca.entities.EditoreEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EditoreMapper {
    EditoreMapper EDITORE_MAPPER = Mappers.getMapper(EditoreMapper.class);

    @Mapping(source = "idEditore", target = "idEditore")
    @Mapping(source = "nomeEditore", target = "nomeEditore")
    @Mapping(source = "contattoEditore", target = "contattoEditore")
    EditoreDTO entityToDto(EditoreEntity editoreEntity);

    @Mapping(source = "idEditore", target = "idEditore")
    @Mapping(source = "nomeEditore", target = "nomeEditore")
    @Mapping(source = "contattoEditore", target = "contattoEditore")
    EditoreEntity dtoToEntity(EditoreDTO editoreDTO);


}
