package br.com.rodrigss.maratonajava.introducao.Arrays.exercicios;

/**
 * @author Rodrigo Estanislau
 */
public class Array10 {
    // Dado um array de 6 posições, troque o primeiro elemento com o último, o segundo com o penúltimo, etc.
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 60};

        System.out.println("Antes da inversão:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        // Troca os elementos
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

        System.out.println("\n\nDepois da inversão:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
