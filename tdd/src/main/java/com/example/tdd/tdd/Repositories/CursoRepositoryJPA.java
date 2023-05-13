package com.example.tdd.tdd.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tdd.tdd.Models.CursoModel;

@Service
public class CursoRepositoryJPA implements ICursoRepository {
    
    @Autowired
    CursoRepository repository;

    @Override
    public CursoModel findByNome(String nome) {
        return this.repository.findByNome(nome);
    }

    @Override
    public CursoModel save(CursoModel cursoModel) {
        return this.repository.save(cursoModel);
    }
    
}
