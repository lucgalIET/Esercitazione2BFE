package com.example.biblioteca.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/*
fare tutte le crud con i dto
1 libro deve avere almeno 1 autore e
implementare tutto nel service e non nel controller(solo endpoint)
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LibroDTO {
    private Long idLibro;
    private String titolo;
    private int pagine;
    private double prezzo;
    private EditoreDTO editoreDTO;
    private List<AutoreDTO> autoreDTOList = new ArrayList<>();
}
