package com.example.biblioteca.service;

import com.example.biblioteca.dto.EditoreDTO;
import com.example.biblioteca.entities.EditoreEntity;
import com.example.biblioteca.entities.LibroEntity;
import com.example.biblioteca.mapper.EditoreMapper;
import com.example.biblioteca.repository.EditoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EditoreService {
    @Autowired
    private EditoreRepository editoreRepository;


    public EditoreDTO saveEditore(EditoreEntity editore) {
        return EditoreMapper.EDITORE_MAPPER.entityToDto(editoreRepository.save(editore));
    }

    public List<EditoreDTO> getAllEditore() {
        List<EditoreEntity>editoreEntityList = editoreRepository.findAll();
        List<EditoreDTO> editoreDTOList=new ArrayList<>();
        for(int i = 0; i<editoreEntityList.size();i++){
            editoreDTOList.add(EditoreMapper.EDITORE_MAPPER.entityToDto(editoreEntityList.get(i)));
        }
        return editoreDTOList;


    }

    public Optional<EditoreDTO> getEditoreById(Long id) {
        Optional<EditoreEntity> editoreEntity = editoreRepository.findById(id);;
        if (editoreEntity.isEmpty()) throw new NullPointerException();
        return Optional.ofNullable(EditoreMapper.EDITORE_MAPPER.entityToDto(editoreEntity.get()));
    }

    public EditoreEntity updateEditore(EditoreEntity editore) {

        Optional<EditoreDTO> editoreDTO = getEditoreById(editore.getIdEditore());
        if (editoreDTO.isEmpty()) throw new NullPointerException();

        return editoreRepository.save(editore);
    }

    public void deleteEditore(Long id) {
        editoreRepository.deleteById(id);
    }

    public List<String> getStudenteNomeContatto() {
        return editoreRepository.getStudenteNomeContatto();
    }

    public List<String> editoriConIdPari() {
        return editoreRepository.editoriConIdPari();
    }

    public List<EditoreDTO> getEditoreInfo() {
       List<EditoreEntity>editoreEntityList = editoreRepository.getEditoreInfo();
       List<EditoreDTO> editoreDTOList=new ArrayList<>();
       for(int i = 0; i<editoreEntityList.size();i++){
           editoreDTOList.add(EditoreMapper.EDITORE_MAPPER.entityToDto(editoreEntityList.get(i)));
       }
       return editoreDTOList;

    }


}