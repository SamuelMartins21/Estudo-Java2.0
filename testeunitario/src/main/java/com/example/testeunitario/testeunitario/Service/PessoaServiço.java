package com.example.testeunitario.testeunitario.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import com.example.testeunitario.testeunitario.Model.Pessoa;

public class PessoaServiço {
    public boolean isAdult(Pessoa pessoa){
       Objects.requireNonNull(pessoa, "Não pode vim sem idade");
        return pessoa.getIdade() >= 18;
    }

    public List<Pessoa> apenasAdultos(List<Pessoa> aPessoas){
        return aPessoas.stream().filter(this::isAdult).collect(Collectors.toList());
    }
}
