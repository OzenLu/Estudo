package ClassesAbstratas.dominio;

// Uma classe abstrata pode conter tanto metodos abstratos quanto não abstratos, mas uma classe
// não abstrata, não pode ter metodos abstratos;

//uma classe abstrata(1) pode extender outra classe abstrata(0), mas essa não precisa obrigatoriamente implementar os seus metodos
//mas as classes concretas, que extendem essa classe abstrata(1), precisam implementar os seus metodos abstratos
//dessa forma, caso a classe abstrata(1) implemente os metodos da classe abstrata(0), os metodos estarão implementados por herança
//nas suas classes filhas
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    public abstract void calcularBonus();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
