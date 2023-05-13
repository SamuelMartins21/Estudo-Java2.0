package com.example.testeunitario.testeunitario.Model;

import lombok.Data;

@Data
public class Pessoa {
    private int idade;

    public Pessoa(int idade) {
        this.idade = idade;
    }
    
}
