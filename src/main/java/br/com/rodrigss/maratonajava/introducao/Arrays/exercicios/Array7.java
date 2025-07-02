package br.com.rodrigss.maratonajava.introducao.Arrays.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Array7 {

    //Leia dois arrays de 5 elementos cada e crie um terceiro array que seja a soma dos dois anteriores (elemento por elemento)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] fileira1 = new int[5];
        int[] fileira2 = new int[5];
        int[] fileira3 = new int[5];

        System.out.println("Números da fileira um");
        for (int i = 0; i < fileira1.length; i++) {
            fileira1[i] = scanner.nextInt();
            System.out.println("Numero: " + fileira1[i]);
        }
        System.out.println("_________________________");
        System.out.println("Números da fileira dois");

        for (int i = 0; i < fileira2.length; i++) {
            fileira2[i] = scanner.nextInt();
            System.out.println("Numero: " + fileira2[i]);
        }
        System.out.println("Agora vai a soma de cada indice de sua fileira!");
        for (int i = 0; i < 5; i++) {
            fileira3[i] = fileira1[i] + fileira2[i];
            System.out.println("A soma das fileiras: " + fileira3[i]);

        }


        scanner.close();
    }

}
