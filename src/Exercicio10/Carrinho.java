package Exercicio10;

//10. Crie uma classe chamada Carrinho com os atributos privados quantidadeItens e valorTotal.
//Implemente os métodos getQuantidadeItens, getValorTotal, adicionarItem(double preco), removerItem(double preco) e aplicarDesconto(double percentual).
//Respeite as seguintes regras:
//o preco deve ser maior que zero;
//não remova item se o carrinho estiver vazio;
//não permita valorTotal negativo;
//o percentual de desconto deve estar entre 0 e 100.
//No método main, simule adição de itens, remoção, aplicação de desconto e exiba um resumo final do carrinho.

public class Carrinho {

    //Atributos sempre aparecem no inicio da classe

    private int quantidadeItens;
    private double valorTotal;

    public Carrinho() {}

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    public String adicionarItem(double preco){
        if (preco <=0) {
            return "Preço deve ser maior que zero.";
        }

//        this (palavra reservada)
//        sempre indica que a variavel pertence a
//         classe, ou seja, a variavel quantidadeItens e valorTotal
//         pertencem a classe carrinho

        this.quantidadeItens +=1;
        this.valorTotal += preco;

        return "Item adicionado com sucesso!";

    }

    public String removerItem(double preco){
        if(this.quantidadeItens > 0){
            return "Não é possível remover item, pois o carrinho está vazio";
        }

        this.quantidadeItens -=1;
        this.valorTotal -= preco;

        return "Item removido com sucesso!";
    }

    public String aplicarDesconto(double percentual){
        if(percentual < 0 || percentual > 100){
            return "Percentual de desconto deve estar entre 0 e 100";
        }

        this.valorTotal -= (this.valorTotal * percentual / 100);

        return "Desconto aplicado com sucesso!";
    }

    public String imprimir(){
        return "Quantidade de itens: " + this.quantidadeItens +
                "\n" + "Valor Total: " + this.valorTotal;

    }

}


