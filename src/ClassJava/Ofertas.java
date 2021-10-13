package ClassJava;

import java.util.ArrayList;
import java.util.List;


public class Ofertas {

    private long id;
    private List<ProdutoDesconto> produtoComDesconto = new ArrayList<ProdutoDesconto>(); // lista de produtosDesconto

    public Ofertas(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<ProdutoDesconto> getProdutoComDesconto() {
        return produtoComDesconto;
    }

    public void setProdutoComDesconto(List<ProdutoDesconto> produtoComDesconto) {
        this.produtoComDesconto = produtoComDesconto;
    }

    @Override
    public String toString() {
        return "Ofertas{" +
                "id=" + id +
                '}';
    }
}
