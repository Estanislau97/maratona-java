package br.com.rodrigss.maratonajava.introducao.Arrays.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Array9 {
    //Leia um array de 8 elementos e calcule a média aritmética dos valores.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] numeros = new double[8];
        double total = 0.0;
        double media = 0.0;

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Posição " + (i + 1));
            numeros[i] = scanner.nextDouble();
            total += numeros[i];
        }
        media = total / numeros.length;
        System.out.println("A média é: " + media);
    scanner.close();
    }
}
