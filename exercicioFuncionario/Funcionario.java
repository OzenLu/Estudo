package exercicioFuncionario;

import java.util.Arrays;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;

    Funcionario(String nome, int idade, double... salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        System.out.print(salario.length + " ultimos salarios: ");
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double mediaSalario() {
        double media = 0;
        for (double salarios : salario) {
            media += salarios;
        }
        double mediaTotal = media / salario.length;
        return mediaTotal;
    }

    public void dados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println(Arrays.toString(getSalario()));
        System.out.println("Media salarial dos ultimos 3 meses: " + mediaSalario());
        for(double salarios: salario){
            System.out.print(salarios + " ");
        }

    }
}
