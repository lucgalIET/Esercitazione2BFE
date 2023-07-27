package com.example.biblioteca.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "editore")
public class EditoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idEditore;

    @Column(name = "nome")
    private String nomeEditore;

    @Column(name = "contatto")
    private String contattoEditore;

}
