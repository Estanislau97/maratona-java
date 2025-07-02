package br.com.rodrigss.maratonajava.introducao.Arrays.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Array13 {
    // Dado um array de 10 elementos com valores inteiros, crie um novo array com os quadrados desses valores.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int[] quadrados = new int[10];

        // Leitura dos valores
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Cálculo dos quadrados
        for (int i = 0; i < numeros.length; i++) {
            quadrados[i] = numeros[i] * numeros[i];
        }

        // Impressão dos resultados
        System.out.println("Números originais e seus quadrados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + "² = " + quadrados[i]);
        }

        scanner.close();
    }
}

