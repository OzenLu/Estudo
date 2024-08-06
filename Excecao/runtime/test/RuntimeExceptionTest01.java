package Excecao.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        divisao(4, 0);

        System.out.println("Código finalizado");
    }

    /**
     * @param a
     * @param b não pode ser 0
     * @return o resultado da divisão de a/b
     * @throws IllegalArgumentException caso b seja 0
     */
    //throws IllegalArgumentException diz que esse metodo pode lançar uma exceção, mas que não é obrigatorio fazer o tratamento dele
    //pois é uma exceção unchecked
    //exceções do tipo runtime o tratamento é opcional e não é muito comum ver esse aviso na assinatura do metodo
    private static int divisao(int a, int b) throws IllegalArgumentException{
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return  a/b;
    }
}
