package Polimorfismo01.Test;

import Polimorfismo01.dominio.Computador;
import Polimorfismo01.dominio.Televisao;
import Polimorfismo01.dominio.Tomate;
import Polimorfismo01.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Computador bonzão", 9000);
        Tomate tomate = new Tomate("Tomate Cereja", 9.0);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);

        System.out.println();
        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(tv);
    }
}
