package ClassesAbstratas.test;

import ClassesAbstratas.dominio.Desenvolvedor;
import ClassesAbstratas.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Zezas", 4000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Kaki", 10000);

        System.out.println(gerente.toString());
        System.out.println(desenvolvedor.toString());
    }
}
