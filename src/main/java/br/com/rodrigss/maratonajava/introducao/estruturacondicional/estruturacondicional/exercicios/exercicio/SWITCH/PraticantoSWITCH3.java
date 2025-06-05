package br.com.rodrigss.maratonajava.introducao.estruturacondicional.estruturacondicional.exercicios.exercicio.SWITCH;

/**
 * @author Rodrigo Estanislau
 */
public class PraticantoSWITCH3 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        int opcao = 3;
        switch (opcao){
            case 1:
                System.out.println("A soma desses números é: " + (num1 + num2));
                break;
            case 2:
                System.out.println("A subtração desses números é: " + (num1 - num2));
                break;
            case 3:
                System.out.println("A multiplicação é " + (num1 * num2));
                break;
            case 4:
                System.out.println("A divisão é " + (num1 / num2));
                break;
            default:
                System.out.println("Operação inválida!");
        }


    }
}
