package br.com.rodrigss.maratonajava.introducao.Arrays.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Array19 {
    // Remova todos os números duplicados de um array de 10 elementos, criando um novo array apenas com os valores únicos.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        int[] unicos = new int[10]; // máximo 10 únicos
        int qtdUnicos = 0;

        for (int i = 0; i < numeros.length; i++) {
            boolean duplicado = false;
            for (int j = 0; j < qtdUnicos; j++) {
                if (numeros[i] == unicos[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                unicos[qtdUnicos++] = numeros[i];
            }
        }

        // Exibe os valores únicos
        System.out.println("Valores únicos:");
        for (int i = 0; i < qtdUnicos; i++) {
            System.out.print(unicos[i] + " ");
        }

        scanner.close();
    }
}
