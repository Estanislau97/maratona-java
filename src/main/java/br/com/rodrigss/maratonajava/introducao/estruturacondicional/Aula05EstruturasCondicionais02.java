package br.com.rodrigss.maratonajava.introducao.estruturacondicional;

/**
 * @author Rodrigo Estanislau
 */
public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {

        int idade = 12;
        String categoria = "";

        if (idade < 15) {
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        }
        System.out.println(categoria);
    }
}
