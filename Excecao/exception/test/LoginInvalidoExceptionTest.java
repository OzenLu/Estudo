package Excecao.exception.test;

import Excecao.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest {
    public static void main(String[] args) {
        try {
            fazerLogin();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    public static void fazerLogin() throws LoginInvalidoException{
        Scanner teclado  = new Scanner(System.in);
        String usuarioDB = "Alberto";
        String senhaDB = "1234";

        System.out.println("Usuario:");
        String usuarioDigitado = teclado.nextLine();
        System.out.println("Senha:");
        String senhaDigitada = teclado.nextLine();

        if(!usuarioDB.equals(usuarioDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuario ou senha invalido");
        }
        System.out.println("Login efetuado com sucesso");
        teclado.close();
    }
}
