package ClassJava;

public class ModelosDosProdutos {

    private long id;
    private String nomeTipo;

    public ModelosDosProdutos(long id, String nomeTipo) {
        this.id = id;
        this.nomeTipo = nomeTipo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public void setNomeTipo(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }

    @Override
    public String toString() {
        return "ModelosDosProdutos{" +
                "id=" + id +
                ", nomeTipo='" + nomeTipo + '\'' +
                '}';
    }
}
