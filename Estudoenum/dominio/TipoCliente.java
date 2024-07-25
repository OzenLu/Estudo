package Estudoenum.dominio;
//Dando atributos para enum, é obrigatorio a criação do construtor para isso.
public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int VALOR;
    public final String NOME_RELATORIO;

    //Adendo, você nunca poderá chamar o construtor, somente a enumeração. o construtor é private
    TipoCliente(int valor, String nomeRelatorio) {
        VALOR = valor;
        NOME_RELATORIO = nomeRelatorio;

    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        //values() cria um array ordenado com todos os Enum.
        //aqui temos um 'for' utilizando esse values() para fazer uma pesquisa nos Enum de TipoCliente
        for (TipoCliente tipoCliente : values()) {
            if(tipoCliente.getNOME_RELATORIO().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }


    public String getNOME_RELATORIO() {
        return NOME_RELATORIO;
    }

    public int getVALOR() {
        return VALOR;
    }
}
