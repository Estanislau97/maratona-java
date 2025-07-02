package br.com.rodrigss.maratonajava.introducao.Arrays.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Array17 {
    // Faça um programa que leia dois arrays de 10 elementos e gere um terceiro array contendo os elementos que
    // aparecem nos dois arrays (interseção).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        System.out.println("Digite 10 números para o primeiro array:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Digite 10 números para o segundo array:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }

        // Encontrar interseção
        int[] intersecao = new int[10]; // no máximo 10 elementos
        int k = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    // Verifica se já está na interseção
                    boolean jaExiste = false;
                    for (int l = 0; l < k; l++) {
                        if (intersecao[l] == array1[i]) {
                            jaExiste = true;
                            break;
                        }
                    }
                    if (!jaExiste) {
                        intersecao[k++] = array1[i];
                    }
                }
            }
        }

        // Exibe o resultado
        if (k == 0) {
            System.out.println("Nenhum número em comum nos dois arrays.");
        } else {
            System.out.print("Elementos em comum (interseção): ");
            for (int i = 0; i < k; i++) {
                System.out.print(intersecao[i] + " ");
            }
        }

        scanner.close();
    }
}
