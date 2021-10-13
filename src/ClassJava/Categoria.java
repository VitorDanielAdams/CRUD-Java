package ClassJava;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private String nome;
    private long id;
    private List<Produto> produto = new ArrayList<Produto>();

    public Categoria(String nome, long id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    // sem métodos

    @Override
    public String toString() {
        return "Categoria{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", produto=" + produto +
                '}';
    }
}