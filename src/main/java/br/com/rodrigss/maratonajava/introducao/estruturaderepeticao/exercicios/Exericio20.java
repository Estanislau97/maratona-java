package br.com.rodrigss.maratonajava.introducao.estruturaderepeticao.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Exericio20 {
   //Simular um caixa eletrônico que só termina quando o usuário digita o valor 0 para saque.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;

        System.out.println("=== Caixa Eletrônico ===");

        do {
            System.out.print("Digite o valor para saque (0 para sair): ");
            valor = scanner.nextInt();

            if (valor > 0) {
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            } else if (valor < 0) {
                System.out.println("Valor inválido. Tente novamente.");
            }

        } while (valor != 0);

        System.out.println("Obrigado por usar o caixa eletrônico. Até logo!");
        scanner.close();
    }
}
