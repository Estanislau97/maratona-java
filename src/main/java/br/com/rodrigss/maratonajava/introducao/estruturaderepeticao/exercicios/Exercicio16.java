package br.com.rodrigss.maratonajava.introducao.estruturaderepeticao.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Exercicio16 {
    //Criar um menu interativo com opções (1 - Cadastro, 2 - Listar, 0 - Sair).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastro");
            System.out.println("2 - Listar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu: Cadastro");
                    // Aqui você pode chamar um método para cadastrar algo
                    break;
                case 2:
                    System.out.println("Você escolheu: Listar");
                    // Aqui você pode chamar um método para listar algo
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}


