package br.com.rodrigss.maratonajava.introducao.Arrays.exercicios;

import java.util.Scanner;
import java.util.Arrays;

public class Array2 {
    // Leia 5 números inteiros do teclado, armazene em um array e depois imprima-os na ordem inversa.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números na ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
