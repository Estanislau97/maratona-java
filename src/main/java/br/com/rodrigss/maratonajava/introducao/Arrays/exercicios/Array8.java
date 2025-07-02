package br.com.rodrigss.maratonajava.introducao.Arrays.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Array8 {
    // Leia um array de 10 números e conte quantos são maiores que 100.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int maiorQueCem = 0;

        System.out.println("Digite 10 números:");

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Número da posição " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] > 100){
                maiorQueCem++;
                System.out.println("Número maior que 100: " + numeros[i]);
            }
        }

        System.out.println("__________________________");
        System.out.println("Quantidade total de números maiores que 100: " + maiorQueCem);

        scanner.close();
    }
}
