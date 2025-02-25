package com.fiap.polimorfismo;

public class VelhoImovel extends Imovel{

    public VelhoImovel(double preco, String endereco) {
        super(preco, endereco);
    }

    @Override
    public void mostrarPreco() {
        double precoFinal =  getPreco() - (getPreco() * .1);
        System.out.println("Preço do imóvel ajustado com desconto: R$" + precoFinal);
    }
}
