package ClassJava;

public class Tamanho {
    private String tam;
    private long id;

    public Tamanho(String tam, long id) {
        this.tam = tam;
        this.id = id;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tamanho{" +
                "tam='" + tam + '\'' +
                ", id=" + id +
                '}';
    }
}
