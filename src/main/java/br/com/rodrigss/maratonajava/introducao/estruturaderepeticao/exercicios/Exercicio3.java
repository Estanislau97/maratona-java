package br.com.rodrigss.maratonajava.introducao.estruturaderepeticao.exercicios;

/**
 * @author Rodrigo Estanislau
 */
public class Exercicio3 {
    //Imprimir os números pares de 1 a 100.
    public static void main(String[] args) {
        int numeroUsu = 112;

        for (int numero = 1; numero <= numeroUsu; numero ++){
            if (numero % 2 == 0){
                System.out.println(numero + " é Par!");
            } else {
                System.out.println(numero + " é Ímpar!");
            }
        }


    }


}
