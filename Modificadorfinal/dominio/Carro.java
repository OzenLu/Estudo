package Modificadorfinal.dominio;

//se uma classe tiver um modificador final, ela não poderá ser pai de uma outra classe
public class Carro {
    private String nome;
    public static final int VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();


    // onde tiver um modificador final, não poderá ser alterado.
    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
