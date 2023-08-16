package com.dice.simulator.Service;

import com.dice.simulator.Model.M_Jogada;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class S_Dados {

    public static M_Jogada jogarDados(int dados, int faces){
        int soma = 0;
        int maximo = 0;
        int resultado = 0;
        int[] jogadas = new int[dados];
        for(int i = 1; i <= dados; i++){
            Random rand = new Random();
            resultado = rand.nextInt(faces) + 1;
            jogadas[i-1] = resultado;
            soma += resultado;
            if(resultado > maximo){
                maximo = resultado;
            }
        }
        M_Jogada m_jogada = new M_Jogada(soma,jogadas,maximo);
        return m_jogada;
    }
}
