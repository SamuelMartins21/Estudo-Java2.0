package com.example.tdd.tdd.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tdd.tdd.Models.CursoModel;
import com.example.tdd.tdd.Repositories.CursoRepositoryJPA;
import com.example.tdd.tdd.Services.CursoService;

@RestController
public class CursoController {
    
    @Autowired
    private CursoRepositoryJPA repositoryJPA;

    @PostMapping ("/")
    public CursoModel criaCurso(@RequestBody CursoModel cursoModel){
        CursoService service = new CursoService(repositoryJPA);
        return service.execute(cursoModel);
    }
}
