package com.fiap.polimorfismo;

public class Main {
    public static void main(String[] args) {
        Imovel imovel = new Imovel(100000,"Rua tranquilo");
        NovoImovel novoImovel = new NovoImovel(130000,"Rua Calma");
        VelhoImovel velhoImovel = new VelhoImovel(204000,"Rua Dr. Marcel");

        imovel.mostrarPreco();
        novoImovel.mostrarPreco();
        velhoImovel.mostrarPreco();
    }
}
