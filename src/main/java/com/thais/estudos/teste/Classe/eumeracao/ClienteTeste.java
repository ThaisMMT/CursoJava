package com.thais.estudos.teste.Classe.eumeracao;

public class ClienteTeste {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Sara",TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente1 = new Cliente("Ração Cão", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Pietra", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);

        System.out.println(cliente);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);

        TipoCliente tipoCliente1 = TipoCliente.tipoClientePorRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente1);
    }
}
