public class Cidade {
    private int codigo;
    private String nome;
    private int populacao;

    public Cidade(int codigo, String nome, int populacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.populacao = populacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }
}
