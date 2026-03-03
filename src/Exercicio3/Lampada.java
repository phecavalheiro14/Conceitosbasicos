package Exercicio3;

//03. Crie uma classe chamada Lampada com os atributos marca, potencia e ligada (boolean).
//Crie um objeto chamado lampada1 e defina seus atributos.
//Exiba o estado da lâmpada (ligada/desligada).
//Como desafio extra, crie outra lâmpada com estado diferente.

public class Lampada {
    private String marca;
    private int pot;
    private boolean ligada;

    public Lampada(String marca,int pot, boolean ligada){
        this.marca = marca;
        this.pot = pot;
        this.ligada = ligada;
    }

    public Lampada(){}

    @Override
    public String toString() {
        return "Lampada | " + marca + " | pot=" + pot + " | ligada=" + ligada;
    }
}
