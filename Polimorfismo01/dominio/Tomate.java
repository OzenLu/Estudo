package Polimorfismo01.dominio;

public class Tomate extends Produto{
    public final double IMPOSTO_POR_CENTO = 0.06;
    private String dataVencimento;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
