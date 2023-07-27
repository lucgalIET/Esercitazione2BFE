package com.example.biblioteca.repository;

import com.example.biblioteca.dto.LibroDTO;
import com.example.biblioteca.entities.LibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<LibroEntity,Long> {

    @Query(value = "SELECT * FROM libro WHERE pagine>400", nativeQuery = true)
    List<LibroEntity> libriConPiuDi400Pagine();

    @Query(value = "SELECT * FROM libro", nativeQuery = true )
    List<LibroEntity> getLibroInfo();

}
