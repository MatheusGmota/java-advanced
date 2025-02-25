package com.fiap.polimorfismo;

public class Imovel {
    private double preco;
    private String endereco;

    public Imovel(double preco, String endereco) {
        this.preco = preco;
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void mostrarPreco() {
        System.out.println("Preço do imóvel: R$" + preco);
    }
}
