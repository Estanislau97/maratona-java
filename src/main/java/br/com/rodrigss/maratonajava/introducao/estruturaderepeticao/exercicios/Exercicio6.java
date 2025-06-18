package br.com.rodrigss.maratonajava.introducao.estruturaderepeticao.exercicios;

/**
 * @author Rodrigo Estanislau
 */
public class Exercicio6 {
    //Imprimir os 10 primeiros números da sequência de Fibonacci.
    public static void main(String[] args) {
            int n = 10; // Quantidade de termos que queremos
            int primeiro = 0;
            int segundo = 1;

            System.out.print("Os 10 primeiros números da sequência de Fibonacci são: ");

            for (int i = 0; i < n; i++) {
                System.out.print(primeiro + " ");

                int proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
            }
        }
    }