package Excecao.exception.test;

import Excecao.exception.dominio.Leitor01;
import Excecao.exception.dominio.Leitor02;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo00();

    }

    /*
        Mais um exemplo do metodo abaixo 'lerArquivo01' so que agora criamos duas classes que implementam
        Closeable: 'Leitor01' e 'Leitor02' e assim podemos utilizar esse TryWithResources pois ele ficara responsavel por
        fechar a conexao dessas classes.

        util em BD e situacoes semelhantes em que abrimos uma conexao e precisamos fecha-la
     */
    public static void lerArquivo00(){
        try(Leitor01 leitor01 = new Leitor01();
            Leitor02 leitor2 = new Leitor02()){

        }catch (IOException e){

        }
    }

    /*
        Essa é uma forma mais moderna que o Java nos deu para tratar da mesma situacao do metodo abaixo
        chamado 'TryWithResoucers' que é a situação de ter esses () no try - 'try()'

        nesse caso, nós declaramos a variavel e instanciamos o objeto junto com o try, assim o proprio Java fica responsavel
        por fechar a conexao dessa variavel de referencia, diferente do metodo lerArquivo02, que precisamos fechar a conexao
        manualmente.

        Detalhes: para isso ser possivel, o objeto que estamos implementando precisa previamente estar implementando as interfaces
        Closeabe ou AutoCloseable
     */

    public static void lerArquivo01(){
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
        Esse metodo aqui ele le um arquivo, mas tem algumas observacoes, por exemplo:
        1° - o arquivo nao existe{
        entao o proprio FileReader nos joga essa excecao, para tratarmos em caso do arquivo nao existir/nao ser encontrado.}

        2° - quando abrimos o arquivo, precisamos tambem fechar ele(no finally){
        entao preecisamos chamar o .close(); mas esse metodo tambem precisa tratar excecoes, em caso de input/output
        entao tambem precisamos de um tratamento para ele}

        mas isso é de certa forma antigo
     */
    public static void lerArquivo02() {
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}