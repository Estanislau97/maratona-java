package br.com.rodrigss.maratonajava.introducao.estruturaderepeticao.exercicios;

/**
 * @author Rodrigo Estanislau
 */
public class Exercicio15 {
    public static void main(String[] args) {
        int contador = 0;

        for (int i = 1; i <= 500; i++) {
            if (i % 13 == 0) {
                contador++;
            }
        }

        System.out.println("Quantidade de números entre 1 e 500 divisíveis por 13: " + contador);
    }
}
