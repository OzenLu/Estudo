package Polimorfismo01.Test;

import Polimorfismo01.repositorio.Repositorio;
import Polimorfismo01.servico.RepositorioArquivo;
import Polimorfismo01.servico.RepositorioBancoDeDados;
import Polimorfismo01.servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio01 = new RepositorioMemoria();
        Repositorio repositorio02 = new RepositorioArquivo();
        Repositorio repositorio03 = new RepositorioBancoDeDados();

        repositorio01.salvar();
        repositorio02.salvar();
        repositorio03.salvar();
    }
}
