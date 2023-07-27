package com.example.biblioteca.repository;

import com.example.biblioteca.dto.EditoreDTO;
import com.example.biblioteca.entities.EditoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EditoreRepository  extends JpaRepository<EditoreEntity,Long> {

    @Query(value = "SELECT nome, contatto FROM editore", nativeQuery = true )
    List<String> getStudenteNomeContatto();

    @Query(value = "SELECT e.id, e.nome,e.contatto" +
            "FROM editore e " +
            "WHERE  id%2=0", nativeQuery = true)
    List<String> editoriConIdPari();

    @Query(value = " SELECT * FROM editore", nativeQuery = true)
    List<EditoreEntity> getEditoreInfo();


}
