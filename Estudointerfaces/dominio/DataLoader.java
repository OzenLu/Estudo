package Estudointerfaces.dominio;

//por padrão, todas as funcoes de uma interface são public e abstract
//por padrão, todos os atributos de uma interface são constantes, ou seja, final
public interface DataLoader {
    void load();

    /*
        Quando uma interface cria novas funções, por padrão as classes que implementam essa interface são obrigadas a
        criar essas funções também, dessa forma podendo quebrar a aplicação.

        o modificador default serve para contornar esse possivel problema, ele cria uma função concreta, ao invés de uma abstrata
        dessa forma é possivel criar o escopo da função direto na interface, ao inves de deixar a cargo das classes que a implementam.
        Dessa forma as proximas classes podem apenas sobrescrever essa função default.
     */
    default void checkPermission(){
        System.out.println("Checando permissoes");
    }
}
