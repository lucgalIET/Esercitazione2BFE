package com.example.biblioteca.controller;

import com.example.biblioteca.dto.AutoreDTO;
import com.example.biblioteca.dto.LibroDTO;
import com.example.biblioteca.entities.AutoreEntity;
import com.example.biblioteca.entities.LibroEntity;
import com.example.biblioteca.service.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autore")
public class AutoreController {
    @Autowired
    private AutoreService autoreService;

    @GetMapping("/get/all")
    public List<AutoreEntity> getAllAutore() {
        return autoreService.getAllAutore();
    }

    @GetMapping("/get/{id}")
    public Optional<AutoreDTO> getAutoreById(@PathVariable Long id) {
        return autoreService.getAutoreById(id);
    }


    @PostMapping("/save")
    public AutoreDTO saveAutore1(@RequestBody AutoreEntity autore) {
        return autoreService.saveAutore(autore);
    }

    @PostMapping("/modifica/{id}")
    public AutoreDTO updateAutore(@RequestBody AutoreEntity autore) {
        return autoreService.saveAutore(autore);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAutore(@PathVariable Long id) {
        autoreService.deleteAutore(id);
    }

    @GetMapping("/info")
    public List<AutoreDTO> getAutoreInfo() {
        return autoreService.getAutoreInfo();
    }

    @PutMapping("/update/{id}")
    public AutoreDTO updateLibro(@RequestBody AutoreDTO autore) {
        return autoreService.updateAutore(autore);
    }
    @PostMapping("/save-DTO")
    public AutoreDTO saveAutore(@RequestBody AutoreEntity autore) {
        return autoreService.saveAutoreDTO(autore);
    }



}
