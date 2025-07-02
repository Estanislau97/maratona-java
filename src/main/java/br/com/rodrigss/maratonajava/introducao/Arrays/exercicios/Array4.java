package br.com.rodrigss.maratonajava.introducao.Arrays.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Array4 {
    //Some todos os elementos de um array de 10 números inteiros.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("Digite o número:" + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        System.out.println("O total desses numeros é : " + soma);
        scanner.close();
    }
}
