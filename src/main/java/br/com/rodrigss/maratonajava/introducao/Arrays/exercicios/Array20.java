package br.com.rodrigss.maratonajava.introducao.Arrays.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Array20 {
    // Implemente uma rotação de array: Dado um array de 10 elementos,
    // desloque todos os elementos uma posição para a direita.
    // O último elemento deve ir para a primeira posição.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        // Leitura dos valores
        System.out.println("Digite 10 números:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // Rotação à direita
        int ultimo = array[array.length - 1]; // Guarda o último elemento

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = ultimo;

        // Exibição após rotação
        System.out.println("Array após rotação à direita:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
