package br.com.rodrigss.maratonajava.introducao.estruturaderepeticao.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Exercicio4 {
    //Imprimir a tabuada de um número informado pelo usuário.
    public static void main(String[] args) {
        int numUsuario = 100;

        System.out.println("Tabuada do número " + numUsuario);
        for (int i = 1; i <= 10; i++){
            System.out.println(numUsuario + " x " + i + "=" + (numUsuario * i));
        }

    }
}
