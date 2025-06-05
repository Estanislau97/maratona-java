package br.com.rodrigss.maratonajava.introducao.estruturacondicional;

/**
 * @author Rodrigo Estanislau
 */
public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte dia = 1;

        switch (dia) {
            case 1:
                System.out.println("Domingo. Final de semana!");
                break;
            case 2:
                System.out.println("Segunda-Feira. Dia útil");
                break;
            case 3:
                System.out.println("Terça-Feira. Dia útil");
                break;
            case 4:
                System.out.println("Quarta-Feira. Dia útil");
                break;
            case 5:
                System.out.println("Quinta-Feira. Dia útil");
                break;
            case 6:
                System.out.println("Sexta-Feira. Dia útil");
                break;
            case 7:
                System.out.println("Sábado. Final de semana!!");
                break;
            default:
                System.out.println("Opção inválida!!!!");
        }
    }
}
