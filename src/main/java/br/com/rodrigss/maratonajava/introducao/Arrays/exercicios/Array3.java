package br.com.rodrigss.maratonajava.introducao.Arrays.exercicios;

/**
 * @author Rodrigo Estanislau
 */
public class Array3 {
    //Crie um array com 7 posições e preencha com os dias da semana. Imprima todos os dias.
    public static void main(String[] args) {
        String[] dias = new String[7];
        dias[0] = "Domingo";
        dias[1] = "Segunda-Feira";
        dias[2] = "Terça-Feira";
        dias[3] = "Quarta-Feira";
        dias[4] = "Quinta-Feira";
        dias[5] = "Sexta-Feira";
        dias[6] = "Sábado";
        for (int i = 0; i < dias.length; i++ )
        System.out.println(dias[i]);
    }

}
