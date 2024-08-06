package Excecao.exception.dominio;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Funcionario extends Pessoa{
    /*
       1° Os metodos sobrescritos não são obrigados a lancarem as mesmas excecoes que os metodos originais
       2° Os metodos sobrescritos podem lançar mais ou menos excecoes
       3° Os metodos sobrescritos não podem lancar excecoes checked ou mais genericas que a do metodo original
     */
    public void salvar(){
        System.out.println("Salvando em Funcionario");
    }
}
