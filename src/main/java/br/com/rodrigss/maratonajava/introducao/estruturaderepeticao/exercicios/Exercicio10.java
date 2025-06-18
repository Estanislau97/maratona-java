package br.com.rodrigss.maratonajava.introducao.estruturaderepeticao.exercicios;

/**
 * @author Rodrigo Estanislau
 */
public class Exercicio10 {
    //Verificar quantos números entre 1 e 1000 são divisíveis por 3 e por 7 ao mesmo tempo.
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++){
            if (i % 3 == 0 && i % 7  == 0  ){
                System.out.println(i);

            }
        }
    }
}
