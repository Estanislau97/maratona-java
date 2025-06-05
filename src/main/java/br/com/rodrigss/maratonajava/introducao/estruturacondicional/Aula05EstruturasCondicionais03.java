package br.com.rodrigss.maratonajava.introducao.estruturacondicional;

/**
 * @author Rodrigo Estanislau
 */
public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario  = 3000;
        String mensagemDoar = "Eu vou doar $500,00 para o DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

    }
}
