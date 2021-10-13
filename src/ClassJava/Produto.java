package ClassJava;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Produto {

    private long id;
    private String nome;
    private Double preco;
    private int qtd;
//    private Categoria categoria;
    private Fornecedor fornecedor; // obj

//    private List<ModelosDosProdutos> modeloDosProdutos = new ArrayList<ModelosDosProdutos>();
//    private List<Cor> cor = new ArrayList<Cor>();
//    private List<Tamanho> tamanho = new ArrayList<Tamanho>();

//    public Produto(long id, String nome, Double preco, int qtd, ClassJava.Fornecedor fornecedor, ClassJava.Categoria categoria) {
//        this.id = id;
//        this.nome = nome;
//        this.preco = preco;
//        this.qtd = qtd;
//        this.fornecedor = fornecedor;
//        this.categoria = categoria;
//    }


    public Produto() {}

    public Produto(long id, String nome, Double preco, int qtd, Fornecedor fornecedor) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
        this.fornecedor = fornecedor;
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

//    public List<ModelosDosProdutos> getModeloDosProdutos() {
//        return modeloDosProdutos;
//    }
//
//    public void setModeloDosProdutos(List<ModelosDosProdutos> modeloDosProdutos) {
//        this.modeloDosProdutos = modeloDosProdutos;
//    }
//
//    public List<Cor> getCor() {
//        return cor;
//    }
//
//    public void setCor(List<Cor> cor) {
//        this.cor = cor;
//    }

//    public ClassJava.Categoria getCategoria() {
//        return categoria;
//    }

//    public void setCategoria(ClassJava.Categoria categoria) {
//        this.categoria = categoria;
//    }

//    public List<Tamanho> getTamanho() {
//        return tamanho;
//    }
//
//    public void setTamanho(List<Tamanho> tamanho) {
//        this.tamanho = tamanho;
//    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String mostra(){
        return "Produto: \n" +
                "id: " + id + '\n' +
                "nome: " + nome + '\n' +
                "preco: " + preco + '\n' +
                "qtd: " + qtd + '\n' +
//                ", modeloDosProdutos=" + modeloDosProdutos +
//                ", cor=" + cor +
//                ", categoria=" + categoria.getNome() +
//                ", tamanho=" + tamanho +
                "fornecedor: " + fornecedor.getNome() + '\n';
    }

    @Override
    public String toString() {
        return "" + id + ';'+
                "" + nome + ';' +
                "" + preco + ';' +
                "" + qtd + ';' +
//                ", modeloDosProdutos=" + modeloDosProdutos +
//                ", cor=" + cor +
//                ", categoria=" + categoria.getNome() +
//                ", tamanho=" + tamanho +
                "" + fornecedor;
    }

    public void salvar(){
        File arq = new File("produtos.txt");

        try {
            if(arq.isFile() ==  false){
                arq.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(arq, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.print(this.id + ";");
            printWriter.print(this.nome + ";");
            printWriter.print(this.preco + ";");
            printWriter.print(this.qtd + ";");
            printWriter.print(this.fornecedor);

            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
