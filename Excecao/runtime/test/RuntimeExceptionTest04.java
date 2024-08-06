package Excecao.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        /*
            Mais uma forma de sintaxe para pegar mais de uma excecao por catch, em caso dessas excecoes receberem o mesmo tipo
            de tratamento dentro do codigo.

            e nao podem estar em mesma linha de heranca - pode pegar duas subclasses que sao derivadas da mesma super classe
            mas nao pode pegar uma subclasse e a superclasse dela.
         */
        try{
            throw new IndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro de ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Dentro de RuntimeException");
        }

        //tratou dois problemas com um mais generico
        try{
            talvezLanceExcecao();
        }catch (IOException | SQLException e){
            System.out.println();
        }
    }
    //dois problemas lançados
    private static void talvezLanceExcecao()throws SQLException, FileNotFoundException{

    }
}
