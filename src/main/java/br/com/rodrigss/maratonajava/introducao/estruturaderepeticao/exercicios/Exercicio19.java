package br.com.rodrigss.maratonajava.introducao.estruturaderepeticao.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Exercicio19 {
    //Ler dois números e exibir a soma. Perguntar se o usuário deseja repetir a operação.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            int soma = num1 + num2;
            System.out.println("A soma é: " + soma);

            scanner.nextLine(); // Consumir o ENTER após o número

            System.out.print("Deseja repetir? (sim/não): ");
            resposta = scanner.nextLine().trim().toLowerCase();

        } while (resposta.equals("sim") || resposta.equals("s"));

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
