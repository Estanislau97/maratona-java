package br.com.rodrigss.maratonajava.introducao.Arrays.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Array11 {
    // Verifique se um determinado número existe dentro de um array de 10 elementos (busca simples).
    public static void main(String[] args) {
        int[] numeros = new int[10];
        numeros[0] = 11;
        numeros[1] = 12;
        numeros[2] = 133;
        numeros[3] = 121;
        numeros[4] = 122;
        numeros[5] = 115;
        numeros[6] = 10;
        numeros[7] = 154;
        numeros[8] = 1121;
        numeros[9] = 132;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para buscar: ");
        int buscado = scanner.nextInt();

        boolean encontrado = false;

        for (int numero : numeros) {
            if (numero == buscado) {
                encontrado = true;
                break; // Já encontrou, não precisa continuar
            }
        }

        if (encontrado) {
            System.out.println("Número " + buscado + " encontrado no array!");
        } else {
            System.out.println("Número " + buscado + " NÃO encontrado no array.");
        }

        scanner.close();
    }
}
