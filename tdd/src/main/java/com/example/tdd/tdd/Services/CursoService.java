package com.example.tdd.tdd.Services;

import org.springframework.stereotype.Service;

import com.example.tdd.tdd.Models.CursoModel;
import com.example.tdd.tdd.Repositories.ICursoRepository;

@Service
public class CursoService {
    final ICursoRepository repository;

    public CursoService(ICursoRepository repository){
        this.repository = repository;
    }

    public CursoModel execute(CursoModel cursoModel){
       CursoModel existCursoModel = this.repository.findByNome(cursoModel.getNome());
       if(existCursoModel != null){
        System.out.println("Curso já existe tente outro");
       }
       return this.repository.save(cursoModel);
    }
}
