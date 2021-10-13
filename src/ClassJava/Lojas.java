package ClassJava;

import java.util.ArrayList;
import java.util.List;

public class Lojas {
    private long id;
    private String nome;
    private Endereco endereco;
    private List<Contatos> contatos = new ArrayList<Contatos>();
    private List<Funcionarios> funcionarios = new ArrayList<Funcionarios>();
    private List<Produto> produtos = new ArrayList<Produto>();


    public Lojas(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Lojas(long id, String nome, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Contatos> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contatos> contatos) {
        this.contatos = contatos;
    }

    public List<Funcionarios> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Lojas{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", contatos=" + contatos +
                ", funcionarios=" + funcionarios +
                ", produtos=" + produtos +
                '}';
    }
}
