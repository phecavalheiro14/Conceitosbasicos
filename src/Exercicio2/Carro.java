package Exercicio2;

//Crie uma classe chamada Carro com os atributos marca, modelo e ano.
//No método main, crie 3 objetos de Carro.
//Preencha os atributos de cada objeto.
//Exiba os dados no formato: Marca: X | Modelo: Y | Ano: Z.

public class Carro{

    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

}
    public Carro(){}

    public String toString(){
        return "Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano;
    }
}
