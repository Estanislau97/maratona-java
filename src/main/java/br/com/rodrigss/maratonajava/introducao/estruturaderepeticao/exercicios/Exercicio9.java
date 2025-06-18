package br.com.rodrigss.maratonajava.introducao.estruturaderepeticao.exercicios;

/**
 * @author Rodrigo Estanislau
 */
public class Exercicio9 {
    //Imprimir os números ímpares entre dois números dados.
        public static void main(String[] args) {
            int numero1 = 5;
            int numero2 = 15;

            System.out.println("Números ímpares entre " + numero1 + " e " + numero2 + ":");

            int inicio = Math.min(numero1, numero2);
            int fim = Math.max(numero1, numero2);

            for (int i = inicio; i <= fim; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }