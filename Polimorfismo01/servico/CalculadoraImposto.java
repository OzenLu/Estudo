package Polimorfismo01.servico;

import Polimorfismo01.dominio.Computador;
import Polimorfismo01.dominio.Produto;
import Polimorfismo01.dominio.Tomate;

public class CalculadoraImposto {
    //redundantes e nessa situação, para cada novo 'produto' vamos precisar de uma funcao nova. apesar de não podermos colocar
    //funções/atributos especificos
//    public static void calcularImpostoComputador(Computador computador){
//        System.out.println("Calculando imposto computador");
//        System.out.println("Nome:" + computador.getNome());
//        System.out.println("Valor:" + computador.getValor());
//        System.out.println("Imposto a ser cobrado:" + computador.calcularImposto());
//    }
//
//    public static void calcularImpostoTomate(Tomate tomate){
//        System.out.println("Calculando imposto tomate.");
//        System.out.println("Nome: " + tomate.getNome());
//        System.out.println("Valor: " + tomate.getValor());
//        System.out.println("Imposto a ser cobrado: " + tomate.calcularImposto());
//    }

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + produto.calcularImposto());
        if (produto instanceof Tomate){
            //temos duas formas de fazer o cast de Produto para Tomate
            String dataVencimento = ((Tomate) produto).getDataVencimento();
            Tomate tomate = (Tomate) produto;

            System.out.println(tomate.getDataVencimento());
            System.out.println(dataVencimento);
        }
    }
}
