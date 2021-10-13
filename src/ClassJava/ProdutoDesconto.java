package ClassJava;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDesconto {
    private Double preco;
    private List<Produto> produto = new ArrayList<Produto>(); // lista de produtos

    public ProdutoDesconto(Double preco) {
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ProdutoDesconto{" +
                "preco=" + preco +
                ", produto=" + produto +
                '}';
    }
}
