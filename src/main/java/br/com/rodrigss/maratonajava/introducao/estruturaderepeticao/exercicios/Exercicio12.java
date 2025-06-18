package br.com.rodrigss.maratonajava.introducao.estruturaderepeticao.exercicios;

/**
 * @author Rodrigo Estanislau
 */
public class Exercicio12 {
    //Contar quantos números positivos o usuário digitou até digitar um número negativo.
    public static void main(String[] args) {
            int[] numeros = {5, 8, 0, 12, -3, 7};  // Exemplo de entrada
            int contador = 0;
            int i = 0;

            while (i < numeros.length && numeros[i] >= 0) {
                contador++;
                i++;
            }

            System.out.println("Quantidade de números positivos digitados: " + contador);
        }
    }