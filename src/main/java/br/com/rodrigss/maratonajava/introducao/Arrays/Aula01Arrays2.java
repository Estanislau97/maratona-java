package br.com.rodrigss.maratonajava.introducao.Arrays;

import java.util.StringJoiner;

/**
 * @author Rodrigo Estanislau
 */
public class Aula01Arrays2 {
    public static void main(String[] args) {

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Hinata";
        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
