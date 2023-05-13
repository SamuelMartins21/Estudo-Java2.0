package com.example.tdd.tdd.Services;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.example.tdd.tdd.Models.CursoModel;
import com.example.tdd.tdd.Repositories.ImCursoRepository;

public class creatCursosTest {
    
    @Test
    public void should_be_able_create_a_new_course(){
        //criar um novo curso
        //criar table de curso(entidade)
        // Id, descrição, nome, cargaHoraria
        CursoModel curso = new CursoModel();
        curso.setDescrição("curso descrição teste");
        curso.setNome("nome teste");
        curso.setCargaHoraria(40);

      ImCursoRepository repository = new ImCursoRepository();
        //Criar um novo service
        CursoService cursoService = new CursoService(repository);
        CursoModel criadoCurso = cursoService.execute(curso);

        //Criar um repositorio de curso
        
        assertNotNull(criadoCurso.getId());
    }
}
