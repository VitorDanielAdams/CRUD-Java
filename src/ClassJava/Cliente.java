package ClassJava;

import java.util.List;
import java.util.ArrayList;

public class Cliente {

    private long id;
    private String nome,senha;
    private int idade;

    private List<Contatos> contatos = new ArrayList<Contatos>();

    private Endereco endereco;

    public Cliente(long id, String nome, String senha, int idade, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.idade = idade;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Contatos> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contatos> contatos) {
        this.contatos = contatos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", idade=" + idade +
                ", contatos=" + contatos +
                ", endereco=" + endereco +
                '}';
    }
}
