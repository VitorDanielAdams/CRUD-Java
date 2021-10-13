package ClassJava;
import java.util.ArrayList;
import java.util.List;

public class Destaques {

    private String nomeColecao;

    private List<Produto> produto = new ArrayList<Produto>();

    public Destaques() {
    }

    public Destaques(String nomeColecao) {
        this.nomeColecao = nomeColecao;
    }

    public String getNomeColecao() {
        return nomeColecao;
    }

    public void setNomeColecao(String nomeColecao) {
        this.nomeColecao = nomeColecao;
    }

    public List<Produto> getProdutos() {
        return produto;
    }

    public void setCursos(List<Produto> cursos) {
        this.produto = cursos;
    }

    @Override
    public String toString() {
        return "Destaques{" +
                "nomeColecao='" + nomeColecao + '\'' +
                ", produto =" + produto +
                '}';
    }
}

