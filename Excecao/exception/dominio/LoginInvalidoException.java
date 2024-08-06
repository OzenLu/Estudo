package Excecao.exception.dominio;

/*
    Podemos criar a nossa propria classe exception, caso o Java nao possua nativamente uma excecao
    que atenda a nossa necessidade, podemos criar uma excecao checked ou unchecked

    por boas praticas, devemos adicionar o Exception no final do nome da classe
 */
public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        System.out.println("Login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
