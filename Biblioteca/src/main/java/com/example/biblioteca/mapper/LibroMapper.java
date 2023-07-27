package com.example.biblioteca.mapper;
import com.example.biblioteca.dto.LibroDTO;
import com.example.biblioteca.entities.LibroEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper
public interface LibroMapper {
    LibroMapper LIBRO_MAPPER = Mappers.getMapper(LibroMapper.class);
    @Mapping(source = "idLibro",target="idLibro")
    @Mapping(source = "titolo",target="titolo")
    @Mapping(source = "pagine",target="pagine")
    @Mapping(source = "prezzo",target="prezzo")
    @Mapping(source = "editoreEntity", target = "editoreDTO")
    LibroDTO entityToDto(LibroEntity libroEntity);

    @Mapping(source = "idLibro",target="idLibro")
    @Mapping(source = "titolo",target="titolo")
    @Mapping(source = "pagine",target="pagine")
    @Mapping(source = "prezzo",target="prezzo")
    @Mapping(source = "editoreDTO", target = "editoreEntity")
    LibroEntity dtoToEntity(LibroDTO libroDTO);


}
