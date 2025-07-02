package br.com.rodrigss.maratonajava.introducao.Arrays.exercicios;

import java.util.Scanner;

/**
 * Autor: Rodrigo Estanislau
 */
public class Array16 {
    // Leia um array de 5 nomes e permita que o usuário pesquise um nome.
    // Caso encontre, mostre a posição. Caso contrário, exiba "Nome não encontrado".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        // Leitura dos nomes
        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print((i + 1) + "º nome: ");
            nomes[i] = scanner.nextLine();
        }

        // Leitura do nome a ser pesquisado
        System.out.print("Digite o nome que deseja buscar: ");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                System.out.println("Nome encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Nome não encontrado.");
        }

        scanner.close();
    }
}
