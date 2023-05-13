package com.example.tdd.tdd.Repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.tdd.tdd.Models.CursoModel;

public class ImCursoRepository implements ICursoRepository  {
    public List<CursoModel> lCursoModels;

    
    public ImCursoRepository() {
        this.lCursoModels = new ArrayList<>();
    }

    @Override
    public CursoModel findByNome(String nome) {
        Optional<CursoModel> filtrarnome = this.lCursoModels.stream().filter(c -> c.getNome().equals(nome)).findFirst();
        return filtrarnome.orElse(null);
    }

    @Override
    public CursoModel save(CursoModel cursoModel) {
        this.lCursoModels.add(cursoModel);
        cursoModel.setId(UUID.randomUUID());
        return cursoModel;
    }
    
}
