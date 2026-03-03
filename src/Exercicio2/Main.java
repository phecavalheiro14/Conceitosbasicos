package Exercicio2;

////Crie uma classe chamada Carro com os atributos marca, modelo e ano.
////No método main, crie 3 objetos de Carro.
////Preencha os atributos de cada objeto.
////Exiba os dados no formato: Marca: X | Modelo: Y | Ano: Z.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new.Scanner(System.in);

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
    }

}
