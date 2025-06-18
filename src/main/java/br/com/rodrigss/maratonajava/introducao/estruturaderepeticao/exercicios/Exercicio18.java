package br.com.rodrigss.maratonajava.introducao.estruturaderepeticao.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Exercicio18 {
    //Ler a idade de várias pessoas até que o usuário digite uma idade negativa e mostrar a média.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        int soma = 0;
        int quantidade = 0;

        System.out.println("Digite as idades (digite um número negativo para encerrar):");

        while (true) {
            idade = scanner.nextInt();
            if (idade < 0) {
                break;
            }
            soma += idade;
            quantidade++;
        }

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade válida foi digitada.");
        }

        scanner.close();
    }
}




