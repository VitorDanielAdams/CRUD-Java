package ClassJava;

import java.util.ArrayList;
import java.util.List;

public class Outlet {

     private List<ProdutoDesconto> produtoComDesconto = new ArrayList<ProdutoDesconto>();
     private List<Lojas> lojas = new ArrayList<Lojas>();

    public List<ProdutoDesconto> getProdutoComDesconto() {
        return produtoComDesconto;
    }

    public void setProdutoComDesconto(List<ProdutoDesconto> produtoComDesconto) {
        this.produtoComDesconto = produtoComDesconto;
    }

    public List<Lojas> getLojas() {
        return lojas;
    }

    public void setLojas(List<Lojas> lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {
        return "Outlet{" +
                "produtoComDesconto=" + produtoComDesconto +
                ", lojas=" + lojas +
                '}';
    }
}