// Faça um programa principal que ofereça um menu de opções ao usuário:
// 1. colocar produto na cesta (usuário deve indicar o tipo e a quantidade);
// 2. mostrar o conteúdo da cesta e, ao final, o valor total da cesta;
// 3. limpar a cesta. Considere o modelo mostrado abaixo:

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Produto Maca = new Produto("Maça",1,2.5);
        System.out.println("Nome: " + Maca.nome);
        System.out.println("Preço: " + Maca.preco);
        System.out.println("Tipo: " + Maca.tipo);

        Produto Cenoura = new Produto("Cenoura",2,5.5);
        System.out.println("Nome: " + Cenoura.nome);
        System.out.println("Preço: " + Cenoura.preco);
        System.out.println("Tipo: " + Cenoura.tipo);

        Produto Alface = new Produto("Alface",3,8.5);
        System.out.println("Nome: " + Alface.nome);
        System.out.println("Preço: " + Alface.preco);
        System.out.println("Tipo: " + Alface.tipo);

        Cesta cesta = new Cesta();
        cesta.adicionarProduto(Maca,10);
        cesta.adicionarProduto(Alface,2);
        cesta.exibirCesta();

    }
}
