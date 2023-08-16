package com.dice.simulator.Model;

public class M_Jogada {
    private int soma;
    private int[] dados;
    private int maximo;

    public M_Jogada(int soma, int[] dados, int maximo) {
        this.soma = soma;
        this.dados = dados;
        this.maximo = maximo;
    }

    public int getSoma() {
        return soma;
    }

    public int[] getDados() {
        return dados;
    }

    public int getMaximo(){
        return maximo;
    }
}
