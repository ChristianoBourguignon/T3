//[Hortifruti] Uma loja de hortifruti colocou um serviço de venda pela internet.
// A classe Cesta contém um lista de, no máximo, 12 produtos.
// Na classe Cesta, o método adicionarProduto coloca um novo produto na cesta.
// Você dever usar uma variável de instância para controlar quantos produtos já estão ocupados.
// Quando estiver cheio, impeça a adição de novos produtos. O método calcularTotal faz o somatório
// dos produtos preço vezes quantidade de cada um dos produtos que estejam na cesta.
// O método listarCesta mostra cada um dos produtos da cesta, indicando o
// tipo de produto (banana, maça, etc.), o preço unitário e a quantidade;
// no final mostre o valor total da cesta. Perceba que a classe Produto é abstrata (está em itálico),
// bem como o método getPreco.

import java.util.*;

public class Cesta {
    private Produto[] prod;
    public int max_qtnd = 12;
    private int qtnd;

    public Cesta() {
        this.prod = new Produto[max_qtnd];
        this.qtnd = 0;
    }


    public boolean adicionarProduto(Produto produto,
                                    int qntdCesta){
        if (qtnd < max_qtnd){
            qtnd++;
            return true;
        } else {
            System.out.println("A cestá está cheia");
            return false;
        }
    }
    public double calcularTotal (Produto produto){
        int i;
        double precoTotal = 0;
        for (i=0;i<max_qtnd;i++){
            precoTotal += prod[i].getPreco();
        }
        return precoTotal;
    }

    public void exibirCesta() {
        String descTipo;

        System.out.println("Produtos na Cesta:");
        for (int i = 0; i < qtnd; i++) {
            switch (prod[i].getTipo()) {
                case 1:
                    descTipo = "Frutas";
                    break;
                case 2:
                    descTipo = "Legumes";
                    break;
                case 3:
                    descTipo = "Verduras";
                    break;
                default:
                    descTipo = "Outro";
                    break;
            }
            System.out.println("Produto: " + prod[i].getNome() +
                    ", Preço: " + prod[i].getPreco() + ", Quantidade: " +
                    prod[i].getQtnd() + ", Tipo: " + descTipo);
        }
    }



}
