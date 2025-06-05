package br.com.rodrigss.maratonajava.introducao.estruturacondicional.estruturacondicional.exercicios.exercicio.IFELSEIF;

/**
 * @author Rodrigo Estanislau
 */
public class PraticandoIFELSEIF01 {
    public static void main(String[] args) {
        double nota1 = 1;
        double nota2 = 1;
        double nota3 = 10;
        double resultado = (nota1 + nota2 + nota3) / 3;

        if (resultado < 5) {
            System.out.println("Reprovado!");
        } else if (resultado >= 5 && resultado < 7){
            System.out.println("Recuperação!");
        } else if (resultado >= 7 && resultado <= 10) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Nota inválida!");
        }

    }
}
