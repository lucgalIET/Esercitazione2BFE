package com.example.biblioteca.repository;

import com.example.biblioteca.dto.AutoreDTO;
import com.example.biblioteca.entities.AutoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutoreRepository extends JpaRepository<AutoreEntity, Long> {

    @Query(value = " SELECT * FROM autore", nativeQuery = true)
    List<AutoreEntity> getAutoreInfo();

}
