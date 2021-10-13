package ClassJava;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Fornecedor> fornecedors = new ArrayList<Fornecedor>();
        List<Produto> produtos = new ArrayList<Produto>();
        Scanner entrada = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        int opcao;

        do{
            System.out.println("1 - Cadastrar:\n2 - Mostrar:\n3 - Excluir:\n0 - Sair");
            opcao = entrada.nextInt();
            switch (opcao){
                case 0:
                    System.out.println("Encerrando . . .");
                break;
                case 1:
                    cadastros(entrada, fornecedors);
                break;
                case 2:
                    read(entrada, fornecedors, produtos);
                break;
                case 3:
                    delete(entrada, fornecedors, produtos);
                break;
                default:
                    System.out.println("Opção Inválida");
            }
        } while(opcao != 0);

    }

    public static void cadastros(Scanner entrada, List fornecedors) throws IOException {
        int opcao;
        do {
            System.out.println("1 - Cadastrar Produto:\n2 - Cadastrar Fornecedor\n0 - Voltar");
            opcao = entrada.nextInt();
            switch (opcao){
                case 0:
                break;
                case 1:

                    Produto prod = new Produto();

                    File arquivoDeTexto = new File ("fornecedores.txt");

                    if(arquivoDeTexto.isFile() ==  false){
                        arquivoDeTexto.createNewFile();
                    }

                    FileReader arq = new FileReader(arquivoDeTexto);
                    BufferedReader lerArq = new BufferedReader(arq);

                    String linha = lerArq.readLine();
                    if (linha == null) {
                        System.out.printf("Você deve cadastrar um fornecedor antes \n");
                        break;
                    }
                    arq.close();

                    System.out.println("Informe o nome do produto");
                    prod.setNome(entrada.next());

                    System.out.println("Informe o preço do produto");
                    prod.setPreco(entrada.nextDouble());

                    System.out.println("Informe o quantidade do produto");
                    prod.setQtd(entrada.nextInt());

                    System.out.println("Selecione um fornecedor");
                    readForn(fornecedors);

                    prod.setFornecedor((Fornecedor) fornecedors.get(entrada.nextInt() - 1));

                    prod.salvar();
                break;
                case 2:
                    Fornecedor forn = new Fornecedor();

                    System.out.println("Informe o nome do fornecedor");
                    forn.setNome(entrada.next());

                    System.out.println("Informe o CNPJ do fornecedor");
                    forn.setCnpj(entrada.next());

                    forn.salvar();
                break;
                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 0);
    }
    public static void read(Scanner entrada, List fornecedors, List produtos){
        int opcao;
        do {
            System.out.println("1 - Mostrar Produtos:\n2 - Mostrar Fornecedores\n0 - Voltar");
            opcao = entrada.nextInt();
            switch (opcao){
                case 0:
                break;
                case 1:
                    readProd(produtos);
                break;
                case 2:
                    readForn(fornecedors);
                break;
                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 0);
    }

    public static void delete(Scanner entrada, List fornecedors, List produtos) throws IOException {
        int opcao;
        do {
            System.out.println("1 - Deletar Produtos:\n2 - Deletar Fornecedores\n0 - Voltar");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 0:
                break;
                case 1:
                    System.out.println("Escolha qual produto quer deletar");
                    readProd(produtos);
                    deletar("produtos.txt", produtos.get(entrada.nextInt() - 1).toString());
                break;
                case 2:
                    System.out.println("Escolha qual produto quer deletar");
                    readForn(fornecedors);
                    deletar("fornecedores.txt", fornecedors.get(entrada.nextInt() - 1).toString());
                break;
                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 0);
    }

    public static void readProd(List produts){
        try {
            File arquivoDeTexto = new File ("produtos.txt");

            if(arquivoDeTexto.isFile() ==  false){
                arquivoDeTexto.createNewFile();
            }

            FileReader fileReader = new FileReader(arquivoDeTexto);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";

            List<String> result = new ArrayList();

            while ((linha = bufferedReader.readLine()) != null) {
                if (linha != null && !linha.isEmpty()) {
                    result.add(linha);
                }
            }
            fileReader.close();
            bufferedReader.close();
            int i = 0;
            for (String s : result) {
                String[] produtos = s.split(";");

                Produto p = new Produto();
                i++;
                p.setId(Integer.valueOf(produtos[0]));
                p.setNome(produtos[1]);
                p.setPreco(Double.valueOf(produtos[2]));
                p.setQtd(Integer.valueOf(produtos[3]));
                Fornecedor f = new Fornecedor(Integer.valueOf(produtos[4]),produtos[5],produtos[6]);
                p.setFornecedor(f);

                System.out.println(i + " - " + p.mostra());

                produts.add(p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readForn(List fornecedors){
        try {
            File arquivoDeTexto = new File ("fornecedores.txt");

            if(arquivoDeTexto.isFile() ==  false){
                arquivoDeTexto.createNewFile();
            }

            FileReader fileReader = new FileReader(arquivoDeTexto);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";

            List<String> result = new ArrayList();

            while ((linha = bufferedReader.readLine()) != null) {
                if (linha != null && !linha.isEmpty()) {
                    result.add(linha);
                }
            }
            fileReader.close();
            bufferedReader.close();
            int i = 0;
            for (String s : result) {
                String[] fornecedor = s.split(";");

                Fornecedor f = new Fornecedor();
                i++;
                f.setId(Integer.valueOf(fornecedor[0]));
                f.setNome(fornecedor[1]);
                f.setCnpj(fornecedor[2]);

                fornecedors.add(f);

                System.out.println(i + " - " + f.mostra());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void deletar(String arquivo, String linha) throws IOException {

        try {
            File inputFile = new File(arquivo);
            if (!inputFile.isFile()) {
                System.out.println("Arquivo não existe");
                return;
            }

            File tempFile = new File(inputFile.getAbsolutePath() + ".tmp");
            BufferedReader br = new BufferedReader(new FileReader(arquivo));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            String line = null;

            while ((line = br.readLine()) != null) {
                if (!line.trim().equals(linha.trim())){
                    pw.println(line);
                    pw.flush();
                }
            }
            pw.close();
            br.close();

            if (!inputFile.delete()) {
                System.out.println("Não foi possivel deletar");
                return;
            }

            if (!tempFile.renameTo(inputFile))
                System.out.println("Não foi possivel renomear o arquivo");
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
