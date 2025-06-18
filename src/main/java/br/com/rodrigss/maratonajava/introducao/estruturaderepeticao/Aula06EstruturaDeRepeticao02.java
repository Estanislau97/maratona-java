package br.com.rodrigss.maratonajava.introducao.estruturaderepeticao;

/**
 * @author Rodrigo Estanislau
 */
public class Aula06EstruturaDeRepeticao02 {
    public static void main(String[] args) {

        for (int i = 0; i < 100000 ; i++) {
            if (i % 1 == 0){
                System.out.println("Número" + i);

            }
        }
    }
}
