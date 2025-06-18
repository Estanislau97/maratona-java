package br.com.rodrigss.maratonajava.introducao.estruturaderepeticao.exercicios;

import java.util.Scanner;

/**
 * @author Rodrigo Estanislau
 */
public class Exercicio13 {
    //Ler uma senha até o usuário digitar a correta.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "1234";
        String senhaDigitada = "";

        System.out.println("Digite a senha:");

        while (!senhaDigitada.equals(senhaCorreta)) {
            senhaDigitada = scanner.nextLine();

            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente:");
            }
        }

        System.out.println("Senha correta! Acesso liberado.");

        scanner.close();
    }
}
