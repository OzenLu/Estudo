package Excecao.exception.test;

import java.io.File;
import java.io.IOException;

/*
    Para criar um erro nessa classe, coloquei as permissões para modificar um arquivo nessa pasta como negados, então ngm pode
    criar um novo arquivo nessa pasta
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        try{
            criarNovoArquivo();
        } catch (Exception e) {
            System.out.println("Erro na criação do arquivo");;
        }
    }


    /*
        Há pros e contras entre criar um try catch dentro de um metodo
        em caso de metodo private é benefico, pois o metodo só pode ser chamado dentro da propria classe, então é interessante
        que seja tratado diretamente no metodo.

        em caso de metodo publico, qualquer pessoa pode chamar esse metodo, então seria interessante jogar a responsabilidade
        do tratamento desse metodo, para o proximo que for chama-lo, afinal cada pessoa pode ter uma visão diferente de tratamento

        em caso de jogar o metodo para o proximo trata-lo, a assinatura ficaria assim:  private static void criarNovoArquivo() throws IOException
     */
    private static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\teste.txt");

        try {
            /*
            Quando voce utiliza um createNewFile(); esse metodo lança uma excecao do tipo checked que PRECISA ser tratada, ou que o tratamento
            seja jogado para o proximo metodo que vai chamar ela(throws IOException), nunca pode ficar sem ser tratada, senão ocasiona um erro de
            compilação.
             */
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+ isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            /*
            Após fazer o tratamento da exceção, você também pode relançar essa exceção, para que o proximo metodo que for
            chamar esse metodo possa dar uma nova finalidade para essa excecao
             */
            throw e;
        }
    }
}
