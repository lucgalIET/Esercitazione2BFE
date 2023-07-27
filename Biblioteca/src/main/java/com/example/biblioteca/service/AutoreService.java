package com.example.biblioteca.service;

import com.example.biblioteca.dto.AutoreDTO;
import com.example.biblioteca.dto.LibroDTO;
import com.example.biblioteca.entities.AutoreEntity;
import com.example.biblioteca.entities.LibroEntity;
import com.example.biblioteca.mapper.AutoreMapper;
import com.example.biblioteca.mapper.LibroMapper;
import com.example.biblioteca.repository.AutoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AutoreService {
    @Autowired
    private AutoreRepository autoreRepository;


    public AutoreDTO saveAutore(AutoreEntity autore) {
        return AutoreMapper.AUTORE_MAPPER.entityToDto(autoreRepository.save(autore));
    }


    public List<AutoreEntity> getAllAutore() {
        return autoreRepository.findAll();
    }


    public Optional<AutoreDTO> getAutoreById(Long id) {
        Optional<AutoreEntity> autoreEntity = autoreRepository.findById(id);
        if (autoreEntity.isEmpty()) throw new NullPointerException();
        return Optional.ofNullable(AutoreMapper.AUTORE_MAPPER.entityToDto(autoreEntity.get()));
    }


    public AutoreDTO updateEditore(AutoreEntity autore) {

        Optional<AutoreDTO> autoreEntity = getAutoreById(autore.getIdAutore());
        if (autoreEntity.isEmpty()) throw new NullPointerException();

        return AutoreMapper.AUTORE_MAPPER.entityToDto(autoreRepository.save(autore));
    }

    public void deleteAutore(Long id) {
        autoreRepository.deleteById(id);
    }


    public List<AutoreDTO> getAutoreInfo() {
        List<AutoreEntity> autoreEntityList = autoreRepository.getAutoreInfo();
        List<AutoreDTO> autoreDTOList = new ArrayList<>();
        for (int i = 0; i < autoreEntityList.size(); i++) {
            autoreDTOList.add(AutoreMapper.AUTORE_MAPPER.entityToDto(autoreEntityList.get(i)));
        }
        return autoreDTOList;
    }

    public AutoreDTO updateAutore(AutoreDTO autore) {
        Optional<AutoreDTO> autoreDTO = getAutoreById(autore.getIdAutore());
        if (autoreDTO.isEmpty()) throw new NullPointerException();
        AutoreEntity autoreEntity1 = AutoreMapper.AUTORE_MAPPER.dtoToEntity(autore);
        return AutoreMapper.AUTORE_MAPPER.entityToDto(autoreRepository.save(autoreEntity1));

    }

    public AutoreDTO saveAutoreDTO(AutoreEntity autore) {

        return AutoreMapper.AUTORE_MAPPER.entityToDto(autoreRepository.save(autore));
    }



}


