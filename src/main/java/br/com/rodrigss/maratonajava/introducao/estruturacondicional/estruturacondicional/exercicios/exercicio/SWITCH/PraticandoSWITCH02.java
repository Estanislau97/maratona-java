package br.com.rodrigss.maratonajava.introducao.estruturacondicional.estruturacondicional.exercicios.exercicio.SWITCH;

/**
 * @author Rodrigo Estanislau
 */
public class PraticandoSWITCH02 {
    public static void main(String[] args) {
        int mes = 82;
        switch (mes) {
            case 1:
                System.out.println("Janeiro tem trinta e um dias");
                break;
            case 2:
                System.out.println("Fevereiro tem vinte e oito dias");
                break;
            case 3:
                System.out.println("Março tem trinta e um dias");
                break;
            case 4:
                System.out.println("Abril tem 30 dias");
                break;
            case 5:
                System.out.println("Maio tem trinta e um dias");
                break;
            case 6:
                System.out.println("Junho tem trinta dias");
                break;
            case 7:
                System.out.println("Julho tem 31 dias");
                break;
            case 8:
                System.out.println("Agosto tem trinta e um dias");
                break;
            case 9:
                System.out.println("Setembro tem trinta dias");
                break;
            case 10:
                System.out.println("Outubro tem trinta e um dias");
                break;
            case 11:
                System.out.println("Novembro tem trinta dias");
                break;
            case 12:
                System.out.println("Dezembro tem trinta e um dias");
                break;
            default:
                System.out.println("Mes inválido!");
        }
    }
}
