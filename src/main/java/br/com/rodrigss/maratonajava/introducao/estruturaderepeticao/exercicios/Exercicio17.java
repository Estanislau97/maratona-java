package br.com.rodrigss.maratonajava.introducao.estruturaderepeticao.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Exercicio17 {
    //Ler um número do usuário e perguntar se ele deseja continuar.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            System.out.println("Você digitou: " + numero);

            System.out.print("Deseja continuar? (sim/não): ");
            resposta = scanner.nextLine().trim().toLowerCase();

        } while (resposta.equals("sim") || resposta.equals("s"));

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}

