package exercicioFuncionario;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Luan", 18, 1200.53, 1200.54, 1200.55, 1300.53, 1450.2, 2000);
        System.out.println(f1.getNome());
        System.out.println(f1.getIdade());
        System.out.println(Arrays.toString(f1.getSalario()));
        System.out.println(f1.mediaSalario());
        System.out.println("-------------------------");
        f1.dados();
    }
}
