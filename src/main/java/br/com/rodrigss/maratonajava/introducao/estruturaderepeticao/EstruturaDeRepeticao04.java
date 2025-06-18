package br.com.rodrigss.maratonajava.introducao.estruturaderepeticao;

/**
 * @author Rodrigo Estanislau
 */
public class EstruturaDeRepeticao04 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                break;
            }
            System.out.printf("Parcela %d:  R$ %.2f%n", parcela, valorParcela);
        }

    }
}
