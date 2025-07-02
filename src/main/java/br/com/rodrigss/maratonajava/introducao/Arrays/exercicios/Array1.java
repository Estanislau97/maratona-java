package br.com.rodrigss.maratonajava.introducao.Arrays.exercicios;

/**
 * @author Rodrigo Estanislau
 */
public class Array1 {
    //Crie um array de 10 inteiros e imprima todos os elementos.
    public static void main(String[] args) {


        int [] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Elemento " + i + ": " + num[i]);

        }
    }
}
