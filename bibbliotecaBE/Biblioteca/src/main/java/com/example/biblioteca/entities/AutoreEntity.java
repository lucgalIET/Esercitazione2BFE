package com.example.biblioteca.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "autore")
public class AutoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idAutore;

    @Column(name = "nome")
    private String nomeAutore;

    @Column(name = "nazionalita")
    private String nazionalitaAutore;

    @ManyToMany(mappedBy = "autoreEntityList")
    @JsonBackReference
    private List<LibroEntity> libroEntityList = new ArrayList<>();

}
