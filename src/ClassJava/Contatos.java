package ClassJava;

public class Contatos {

    private long id;
    private String tel,email;

    public Contatos(long id, String tel, String email) {
        this.id = id;
        this.tel = tel;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contatos{" +
                "id=" + id +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}

