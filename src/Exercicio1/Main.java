package Exercicio1;

////Enunciado
////Crie uma classe chamada Pessoa com os atributos nome e idade.
////No programa principal, crie 2 objetos da classe Pessoa.
////Atribua valores diferentes para cada objeto.
////Exiba os dados de cada pessoa.

import Exercicio1.Pessoa;

public class Main {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Pedro",18);
        Pessoa pessoa2 = new Pessoa("Gabriel",19);

        System.out.println("Pessoa1: " + pessoa1);
        System.out.println("Pessoa2: " + pessoa2);

    }
}