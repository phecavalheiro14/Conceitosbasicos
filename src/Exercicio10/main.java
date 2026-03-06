package Exercicio10;

//10. Crie uma classe chamada Carrinho com os atributos privados quantidadeItens e valorTotal.
//Implemente os métodos getQuantidadeItens, getValorTotal, adicionarItem(double preco), removerItem(double preco) e aplicarDesconto(double percentual).
//Respeite as seguintes regras:
//
//o preco deve ser maior que zero;
//
//não remova item se o carrinho estiver vazio;
//
//não permita valorTotal negativo;
//
//o percentual de desconto deve estar entre 0 e 100.
//
//No método main, simule adição de itens, remoção, aplicação de desconto e exiba um resumo final do carrinho.

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        System.out.println("Carrinho aberto! Vamos gastar!\n" +
                "Digite <add> para adicionar item, " +
                "<remove> para remover item, " +
                "<imprimir> para imprimir o carrinho: " +
                "<desconto> para aplicar desconto e" +
                "<sair para finalizar compra.");
        Scanner sc = new Scanner(System.in);

        while(true){
          switch (sc.nextLine()) {
              case "add":
                  System.out.println("Digite o preço do item a ser adicionado:");
                  double preco = sc.nextDouble();
                  sc.nextLine();
                  carrinho.adicionarItem(preco);
                  break;
              case "remove":
                  System.out.println("Digite o que gostaria de remover:");
                  sc.nextLine();
                  carrinho.removerItem(carrinho.getQuantidadeItens());
                  break;
              case "imprimir":
                  System.out.println("Quantidade de itens: " + carrinho.getQuantidadeItens());
                  System.out.println("Valor total: " + carrinho.getValorTotal());
                  break;
              case "sair":
                  return; //encerra o programa
              default:
                  System.out.println("Comando inválido. Tente novamente.");
          }
        }

    }

}
