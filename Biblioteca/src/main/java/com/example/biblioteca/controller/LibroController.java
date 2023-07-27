package com.example.biblioteca.controller;

import com.example.biblioteca.dto.LibroDTO;
import com.example.biblioteca.entities.LibroEntity;
import com.example.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/get/all")
    public List<LibroDTO> getAllLibro() {
        return libroService.getAllLibro();
    }

    @GetMapping("/get/{id}")
    public Optional<LibroDTO> getlibroById(@PathVariable Long id) {
        return libroService.getLibroById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLibroById(@PathVariable Long id) {
        libroService.deleteLibroById(id);
    }


    @PostMapping("/save")
    public LibroDTO saveLibro(@RequestBody LibroEntity libro) {
        return libroService.saveLibro(libro);
    }

    @PutMapping("/update/{id}")
    public LibroDTO updateLibro(@RequestBody LibroEntity libro) {
        return libroService.updateLibro(libro);
    }

    @GetMapping("/libriConPiuDi400Pagine")
    public List<LibroDTO> libriConPiuDi400Pagine() {
        return libroService.libriConPiuDi400Pagine();
    }


    @GetMapping("/get-libro-info")
    public List<LibroDTO> getLibroInfo() {
        return libroService.getLibroInfo();
    }

}




