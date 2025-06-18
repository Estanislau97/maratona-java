package br.com.rodrigss.maratonajava.introducao.estruturaderepeticao.exercicios;

/**
 * @author Rodrigo Estanislau
 */
public class Exercicio5 {
    //Calcular a soma dos 100 primeiros números inteiros positivos.
    public static void main(String[] args) {
        int numAtual;
        int soma = 0;

        for (int i = 1; i <= 100; i++){
        numAtual = i;
        soma += numAtual;
        int resultado = soma;
            System.out.println("Resultado " + resultado);

        }


    }
}
