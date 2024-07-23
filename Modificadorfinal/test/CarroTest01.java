package Modificadorfinal.test;

import Modificadorfinal.dominio.Carro;
import Modificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);

        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Fernando");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.imprime();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
