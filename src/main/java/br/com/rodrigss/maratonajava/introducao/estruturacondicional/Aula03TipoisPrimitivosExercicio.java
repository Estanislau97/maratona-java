package br.com.rodrigss.maratonajava.introducao.estruturacondicional;


/**
 * @author Rodrigo Estanislau
    Crie varaveis,para os campos descritos abaixo abaxo entre<>e imprimira o seguinte:
 Eu nome <nome>, morando no endereço <endereçõ><
    confirmo que recebi o salário <salario>, na data <data>
 */

public class Aula03TipoisPrimitivosExercicio {
    public static void main(String[] args) {

        String nome;
        String endereco;
        double salario;
        int data;
        nome = "Rodrigo";
        endereco = "Rua Caju";
        salario = 1260;
        data = 102030;

        System.out.println("Eu, " + nome + ". Morando no endereço\n " + endereco +
        ". Confirmo que recebi o salário de " + salario + " na data " + data);

    }
}
