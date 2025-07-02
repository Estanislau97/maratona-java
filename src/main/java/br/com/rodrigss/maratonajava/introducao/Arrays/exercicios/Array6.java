package br.com.rodrigss.maratonajava.introducao.Arrays.exercicios;

import java.util.Scanner;

public class Array6 {
    // Dado um array de 10 números inteiros, encontre o maior e o menor valor.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Lendo os 10 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Inicializa maior e menor com o primeiro valor do array
        int maior = numeros[0];
        int menor = numeros[0];

        // Percorre o array a partir do segundo elemento
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("\nMaior número: " + maior);
        System.out.println("Menor número: " + menor);

        scanner.close();
    }
}
