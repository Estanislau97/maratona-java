package br.com.rodrigss.maratonajava.introducao.Arrays.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Array12 {
    // Leia um array de 10 posições e copie apenas os valores ímpares para um novo array. Depois, imprima esse novo array.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Leitura dos números
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Conta quantos números ímpares existem
        int qtdImpares = 0;
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                qtdImpares++;
            }
        }

        // Cria novo array apenas com os ímpares
        int[] impares = new int[qtdImpares];
        int index = 0;
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                impares[index++] = numero;
            }
        }

        // Exibe os valores ímpares
        System.out.println("Números ímpares:");
        for (int numero : impares) {
            System.out.print(numero + " ");
        }

        scanner.close();
    }
}
