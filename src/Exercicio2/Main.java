package Exercicio2;

////Crie uma classe chamada Carro com os atributos marca, modelo e ano.
////No método main, crie 3 objetos de Carro.
////Preencha os atributos de cada objeto.
////Exiba os dados no formato: Marca: X | Modelo: Y | Ano: Z.

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Chevrolet" , "Chevette",1990);
        Carro carro2 = new Carro("Ford" , "Mustang",2025);
        Carro carro3 = new Carro("Nissan" , "Skyline",2000);

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);

    }

}
