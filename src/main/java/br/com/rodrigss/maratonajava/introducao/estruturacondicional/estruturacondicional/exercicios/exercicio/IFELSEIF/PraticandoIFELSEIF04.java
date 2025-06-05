package br.com.rodrigss.maratonajava.introducao.estruturacondicional.estruturacondicional.exercicios.exercicio.IFELSEIF;

/**
 * @author Rodrigo Estanislau
 */
public class PraticandoIFELSEIF04 {
    public static void main(String[] args) {
        int idade = 110;

        if (idade < 12){
            System.out.println("Criança!");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Adolescente!");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto!");
        } else if (idade >= 60 && idade < 105) {
            System.out.println("Idoso");
        } else {
            System.out.println("Idade invalida!");
        }
    }
}
