package ClassJava;

public class Cor {

   private String nome;
   private String hexadecimal;

    public Cor(String nome, String hexadecimal) {
        this.nome = nome;
        this.hexadecimal = hexadecimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHexadecimal() {
        return hexadecimal;
    }

    public void setHexadecimal(String hexadecimal) {
        this.hexadecimal = hexadecimal;
    }

    @Override
    public String toString() {
        return "Cor{" +
                "nome='" + nome + '\'' +
                ", hexadecimal='" + hexadecimal + '\'' +
                '}';
    }
}
