package com.example.tdd.tdd.Repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tdd.tdd.Models.CursoModel;

public interface CursoRepository extends JpaRepository<CursoModel, UUID> {
    
    CursoModel findByNome(String cursoModel);
}
