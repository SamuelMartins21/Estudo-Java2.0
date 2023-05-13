package com.example.testeunitario.testeunitario.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.testeunitario.testeunitario.Model.Pessoa;

public class PessoaServiceTest {
    private Pessoa adulto;
    private Pessoa nAdulto;
    private PessoaServiço pessoaServiço;
    
    @BeforeEach //Executado antes de cada um dos testes unitários 
    public void setUp(){
        adulto = new Pessoa(18);
        nAdulto = new Pessoa(14);
        pessoaServiço = new PessoaServiço();
    }

    @Test
    void testIsAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        Assertions.assertFalse(pessoaServiço.isAdult(nAdulto));
    }
    
    @Test
    void testIsAdult_ReturnTrue_WhenAgeIsGreaterOrEqualsThan18() {
        Assertions.assertTrue(pessoaServiço.isAdult(adulto));
    }

    @Test
    void testIsAdult_ReturnException_WhenAgeIsNull() {
        Assertions.assertThrows(NullPointerException.class,
         () -> pessoaServiço.isAdult(null));
    }
}