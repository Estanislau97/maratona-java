package br.com.rodrigss.maratonajava.introducao.estruturacondicional.estruturacondicional.exercicios.exercicio.SWITCH;

/**
 * @author Rodrigo Estanislau
 */
public class PraticandoSWITCH {
    public static void main(String[] args) {
        int menu = 2;

        switch (menu){
            case 1:
                System.out.println("Cadastrar");
                break;
            case 2:
                System.out.println("Atualizar");
                break;
            case 3:
                System.out.println("Excluir");
                break;
            default:
                System.out.println("Opção inválida!");
        }

    }
}
