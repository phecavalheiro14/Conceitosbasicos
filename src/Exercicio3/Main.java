package Exercicio3;

//03. Crie uma classe chamada Lampada com os atributos marca, potencia e ligada (boolean).
//Crie um objeto chamado lampada1 e defina seus atributos.
//Exiba o estado da lâmpada (ligada/desligada).
//Como desafio extra, crie outra lâmpada com estado diferente.

public class Main {
    public static void main(String[]args){

        Lampada lampada = new Lampada("Philips" , 10, true);
        Lampada lampada1 = new Lampada("Avant" ,20, false);

        System.out.println(lampada);
        System.out.println(lampada1);
    }
}
