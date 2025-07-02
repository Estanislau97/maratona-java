package br.com.rodrigss.maratonajava.introducao.Arrays.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Array5 {
    //Conte quantos números pares existem em um array de 15 números inteiros.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];
        int contador = 0;
        String numerosPares = ""; // para guardar os pares

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                contador++;
                numerosPares += numeros[i] + " ";
            }
        }

        System.out.println("\nQuantidade de números pares: " + contador);
        System.out.println("Números pares: " + numerosPares.trim());

        scanner.close();
    }
}
