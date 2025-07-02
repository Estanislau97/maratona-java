package br.com.rodrigss.maratonajava.introducao.Arrays.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Array14 {
    //Implemente um programa que calcule a soma dos elementos nas posições pares de um array de 10 elementos.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int posicaoPar = 0;
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o número desejado " + (i + 1));
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 ==0){
                posicaoPar += numeros[i];
            }
        }
        System.out.println("A soma dos números pares são: " + posicaoPar);

        scanner.close();
    }}


