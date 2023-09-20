import java.util.List;

public class Passageiro {
    private String cpf;
    private String nome;
    private String email;
    private List<Passagem> passagens;

    public Passageiro(String cpf, String nome, String email, List<Passagem> passagens) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.passagens = passagens;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Passagem> getPassagens() {
        return passagens;
    }

    public void setPassagens(List<Passagem> passagens) {
        this.passagens = passagens;
    }
}
