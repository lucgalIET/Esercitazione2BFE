package com.example.biblioteca.controller;


import com.example.biblioteca.dto.EditoreDTO;
import com.example.biblioteca.entities.EditoreEntity;
import com.example.biblioteca.service.EditoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/editore")
public class EditoreController {
    @Autowired
    private EditoreService editoreService;

    @GetMapping("/get/all")
    public List<EditoreDTO> getAllEditore() {
        return editoreService.getAllEditore();
    }

    @GetMapping("/get/{id}")
    public Optional<EditoreDTO> getEditoreById(@PathVariable Long id) {
        return editoreService.getEditoreById(id);

    }

    @PostMapping("/save")
    public EditoreDTO saveEditore(@RequestBody EditoreEntity editore) {
        return editoreService.saveEditore(editore);
    }

    @PostMapping("/update/{id}")
    public EditoreDTO updateEditore(@RequestBody EditoreEntity editore) {
        return editoreService.saveEditore(editore);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEditore(Long id) {
        editoreService.deleteEditore(id);
    }

    @GetMapping("/editore-nome-contatto")
    public List<String> getStudenteNomeContatto() {
        return editoreService.getStudenteNomeContatto();
    }

    @GetMapping("/IdPari")
    List<String> editoriConIdPari() {
        return editoreService.editoriConIdPari();
    }

    @GetMapping("/info")
    List<EditoreDTO> getEditoreInfo() {
        return editoreService.getEditoreInfo();
    }

}
