package ClassJava;
import java.util.ArrayList;
import java.util.List;

public class Favoritos {

    private List<Produto> Produtos = new ArrayList<Produto>();
    private List<Cliente> Cliente = new ArrayList<Cliente>();

    public Favoritos() {
    }

    public List<Produto> getProdutos() {
        return Produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        Produtos = produtos;
    }

    public List<ClassJava.Cliente> getCliente() {
        return Cliente;
    }

    public void setCliente(List<ClassJava.Cliente> cliente) {
        Cliente = cliente;
    }

    @Override
    public String toString() {
        return "Favoritos{" +
                "Produtos=" + Produtos +
                ", Cliente=" + Cliente +
                '}';
    }
}
