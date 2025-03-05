package dio.springboot.SingletonPrototype;

public class Remetente {

    private String nome;

    private String email;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Remetente{" +
                "nome=" + nome + '\'' +
                ", email=" + email + '\'' +
                "}";
    }
}
