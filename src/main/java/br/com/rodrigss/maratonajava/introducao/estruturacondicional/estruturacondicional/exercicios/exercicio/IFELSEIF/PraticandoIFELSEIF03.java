package br.com.rodrigss.maratonajava.introducao.estruturacondicional.estruturacondicional.exercicios.exercicio.IFELSEIF;

/**
 * @author Rodrigo Estanislau
 */
public class PraticandoIFELSEIF03 {
    public static void main(String[] args) {
        int num = 113;
        if (num >= 0 && num <= 10){
            System.out.println("Esse número está entre 0 e 10!");
        } else if (num >= 11 && num <= 20) {
            System.out.println("Esse número está entre 11 e 20");
        } else if (num > 20) {
            System.out.println("Esse número é maior que 20!");
        } else {
            System.out.println("Número inválido!");
        }
    }
}
