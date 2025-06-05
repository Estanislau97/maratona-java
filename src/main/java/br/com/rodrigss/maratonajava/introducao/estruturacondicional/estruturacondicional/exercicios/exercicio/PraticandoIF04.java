package br.com.rodrigss.maratonajava.introducao.estruturacondicional.estruturacondicional.exercicios.exercicio;

/**
 * @author Rodrigo Estanislau
 */
public class PraticandoIF04 {
    public static void main(String[] args) {
        int ano = 2000;
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Ano bissexto");
        }
    }
}

