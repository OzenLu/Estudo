package Excecao.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        /*
            A excecao mais generica deve vir sempre no final, se a mais generica estiver no começo, as demais
            nao sao executadas
         */
        try{
            throw new IndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro de ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro de IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro de IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro de ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Dentro de RuntimeException");
        }

        //tratou dois problemas com um mais generico
        try{
            talvezLanceExcecao();
        }catch (Exception e){
            System.out.println();
        }
    }
    //dois problemas lançados
    private static void talvezLanceExcecao()throws SQLException, FileNotFoundException{

    }
}
