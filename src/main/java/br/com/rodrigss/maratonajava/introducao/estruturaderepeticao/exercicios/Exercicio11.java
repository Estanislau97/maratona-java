package br.com.rodrigss.maratonajava.introducao.estruturaderepeticao.exercicios;

/**
 * @author Rodrigo Estanislau
 */
public class Exercicio11 {
    //Ler números até o usuário digitar 0 e mostrar a soma total.
    public static void main(String[] args) {
        int[] numeros = {5, 10, -3, 0};  // Exemplo de números (pode mudar os valores)
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                break;  // Quando encontrar 0, para o loop
            }
            soma += numeros[i];
        }

        System.out.println("A soma total é: " + soma);
    }
}