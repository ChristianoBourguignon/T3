// Cada produto pode ser de um dos tipos (subclasses) derivados de Produto.
// Cada uma das subclasses define um valor fixo que vale para todos os objetos
// daquela classe e corresponde ao preço de cada unidade do produto.

public class Produto {
    public String nome;
    public int tipo;
    public double preco;
    public int qntdProd;

    public Produto(String nome, int tipo, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public int getTipo(){
        return tipo;
    }
    public double getPreco(){
        return preco;
    }
    public double getQtnd(){
        return qntdProd;
    }
}
