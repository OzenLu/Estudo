package Polimorfismo01.Test;

import Polimorfismo01.dominio.Computador;
import Polimorfismo01.dominio.Produto;
import Polimorfismo01.dominio.Tomate;
import Polimorfismo01.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Computador fraquinho", 3000);
        Produto produto02 = new Tomate("Tomate", 12);

        Tomate tomate = new Tomate("Tomatinho", 8);
        tomate.setDataVencimento("11/11/2011");

        CalculadoraImposto.calcularImposto(produto);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(produto02);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(tomate);


        /*
            Podemos criar um objeto especifico utilizando a super class generica dele, porém não poderemos acessar os
            seus atributos e/ou funcoes especificas. não podemos utilizar o getDataVencimento() por exemplo.
         */

    }
}
