package com.example.tdd.tdd.Repositories;

import com.example.tdd.tdd.Models.CursoModel;

public interface ICursoRepository {
    
    CursoModel findByNome(String nome);
    CursoModel save(CursoModel cursoModel);
}
