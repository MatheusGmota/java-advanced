package com.fiap.polimorfismo;

public class NovoImovel extends Imovel{

    public NovoImovel(double preco, String endereco) {
        super(preco, endereco);
    }

    @Override
    public void mostrarPreco() {
        double precoFinal = getPreco() * 1.1;
        System.out.println("Preço do imóvel ajustado com aumento: R$" + precoFinal);
    }
}
