package br.com.rodrigss.maratonajava.introducao.Arrays.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Array15 {
    // Leia um array de 10 números e mostre apenas os números primos.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números primos:");
        for (int numero : numeros) {
            if (ehPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }

        scanner.close();
    }

    // Método auxiliar para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
