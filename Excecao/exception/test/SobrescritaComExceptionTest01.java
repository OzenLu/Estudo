package Excecao.exception.test;

import Excecao.exception.dominio.Funcionario;
import Excecao.exception.dominio.LoginInvalidoException;
import Excecao.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();

    }
}
