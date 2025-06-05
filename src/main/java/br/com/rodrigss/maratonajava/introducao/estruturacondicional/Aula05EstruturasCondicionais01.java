package br.com.rodrigss.maratonajava.introducao.estruturacondicional;

/**
 * @author Rodrigo Estanislau
 */
public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 19;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica!");

        }
    }
}
