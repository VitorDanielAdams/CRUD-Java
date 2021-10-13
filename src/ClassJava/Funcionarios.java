package ClassJava;
import java.util.ArrayList;
import java.util.List;

public class Funcionarios {
    private long id;
    private String nome, cargo;
    private Endereco endereco;
    private List<Contatos> contatos = new ArrayList<Contatos>();

    public Funcionarios(long id, String nome, String cargo, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Contatos> getCursos() {
        return contatos;
    }

    public void setCursos(List<Contatos> cursos) {
        this.contatos = contatos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<Contatos> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contatos> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", endereco=" + endereco +
                ", contatos=" + contatos +
                '}';
    }
}
