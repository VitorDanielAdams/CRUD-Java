package ClassJava;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.*;

public class Fornecedor {

    private long id;
    private String nome;
    private String cnpj;
//    private Endereco endereco; // OBJETO -> endereço
//
//    private List<Contatos> contatos = new ArrayList<Contatos>(); // lista de contatos

//    public Fornecedor(long id, String nome, String cnpj, Endereco endereco) {
//        this.id = id;
//        this.nome = nome;
//        this.cnpj = cnpj;
//        this.endereco = endereco;
//    }


    public Fornecedor() {}

    public Fornecedor(long id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

//    public Endereco getEndereco() {
//        return endereco;
//    }
//
//    public void setEndereco(Endereco endereco) {
//        this.endereco = endereco;
//    }
//
//    public List<Contatos> getContatos() {
//        return contatos;
//    }
//
//    public void setContatos(List<Contatos> contatos) {
//        this.contatos = contatos;
//    }

    public String mostra(){
        return "Fornecedor: \n" +
                "id " + id + '\n' +
                "nome " + nome + '\n' +
                "cnpj " + cnpj + '\n';
    }

    @Override
    public String toString() {
        return  "" + id + ';' +
                ""+nome + ';' +
                ""+cnpj + '\n'
//                ", endereco=" + endereco +
//                ", contatos=" + contatos +
                ;
    }

    public void salvar(){
        File arq = new File("fornecedores.txt");

        try {
            if(arq.isFile() ==  false){
                arq.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(arq, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.print(this.id + ";");
            printWriter.print(this.nome + ";");
            printWriter.println(this.cnpj);

            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
