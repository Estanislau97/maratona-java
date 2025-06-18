package br.com.rodrigss.maratonajava.introducao.estruturaderepeticao.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Exercicio14 {
   //Ler notas de alunos até o usuário digitar -1 e calcular a média.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        double soma = 0;
        int quantidade = 0;

        System.out.println("Digite as notas dos alunos (digite -1 para encerrar):");

        while (true) {
            nota = scanner.nextDouble();

            if (nota == -1) {
                break;
            }

            soma += nota;
            quantidade++;
        }

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("A média das notas é: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }

        scanner.close();
    }
}

