package Estudoenum.test;

import Estudoenum.dominio.Cliente;
import Estudoenum.dominio.TipoCliente;
import Estudoenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        /*
            É possivel criar e chamar um enum de duas formas:
            - Criando a classe Enum dentro de outra classe, é possível mas não é tão recomendando.
            {
                Dessa forma é possivel importar o Enum dessa classe criada anteriormento, por exeplo:
                import Estudoenum.dominio.Cliente.TipoPagamento;

                ou utilizando o TipoPagamento direto, afinal a classe Cliente ja foi importada.
            }
            - Criando uma classe propriamente Enum
         */

        Cliente cliente01 = new Cliente("Zezinho", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente02 = new Cliente("Tere", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente cliente03 = new Cliente("Gabriel", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente04 = new Cliente("Eustacio", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        //testando o toString dos objetos Cliente
        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);
        System.out.println(cliente04);

        //testando a funcao da classe Enum TipoPagamento
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        //testando uma pesquisa por um atributo do Enum
        System.out.println(TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica"));
        System.out.println(TipoCliente.tipoClientePorNomeRelatorio("Pessoa Juridica"));
        System.out.println(TipoCliente.tipoClientePorNomeRelatorio("Pessoa Ficica"));
        System.out.println(TipoCliente.valueOf("PESSOA_FISICA"));
    }
}
