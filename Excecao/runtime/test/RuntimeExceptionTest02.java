package Excecao.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {

        String conexao = abrirConexao();
        System.out.println(conexao);

    }
    public static String abrirConexao(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo no arquivo");
            // com esse throw new, criamos uma excecao para que o metodo retorne null.
           // throw new IllegalArgumentException();
            return "Conexao aberta";
        }catch(Exception e){
            e.printStackTrace();
        }finally { //o finally sera executando independendo de tudo. com excecao ou sem excecao ele sera executado
            System.out.println("Fechando recursos liberado pelo SO");
        }
        return null;
    }
}
