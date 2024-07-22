package ExercicioAssociacao.test;

import ExercicioAssociacao.dominio.Aluno;
import ExercicioAssociacao.dominio.Professor;
import ExercicioAssociacao.dominio.Seminario;

public class Main {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Henrique", 19);
        Aluno aluno02 = new Aluno("Fernando", 20);
        Aluno aluno03 = new Aluno("Jesus", 21);
        Aluno aluno04 = new Aluno("Robert", 22);

        Professor professor01 = new Professor("Enrique", "Segurança Digital");
        Professor professor02 = new Professor("Iglesias", "Banco de Dados");

        Seminario seminario01 = new Seminario("Tecnologia", "Ladeira das cruzes");
        Seminario seminario02 = new Seminario("Nano Tecnologia", "Ladeira das cruzes", aluno03, aluno04);

        professor01.setSeminarios(seminario01, seminario02);
        seminario01.setProfessor(professor01);
        seminario02.setProfessor(professor01);

        professor02.setSeminarios(seminario01);
        seminario01.setProfessor(professor02);

        seminario01.setAlunos(aluno01, aluno02);
        aluno01.setSeminario(seminario01);
        aluno02.setSeminario(seminario01);

        aluno03.setSeminario(seminario02);
        aluno04.setSeminario(seminario02);

        System.out.println("--------Alunos--------");
        aluno01.imprimir();
        System.out.println();
        aluno02.imprimir();
        System.out.println();
        aluno03.imprimir();
        System.out.println();
        aluno04.imprimir();
        System.out.println();

        System.out.println("--------Professores--------");
        professor01.imprimir();
        System.out.println();
        professor02.imprimir();

        System.out.println("--------Seminarios--------");
        seminario01.imprimir();
        System.out.println();
        seminario02.imprimir();
    }
}
