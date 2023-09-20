import java.util.List;

public class Voo {
    private String prefixo;
    private Aeroporto origem;
    private Aeroporto destino;
    private String dataHoraPartida;
    private String dataHoraChegada;
    private String aeronave;
    private int limitePassageiros;
    private List<Passageiro> passageiros;

    public Voo(String prefixo, Aeroporto origem, Aeroporto destino, String dataHoraPartida, String dataHoraChegada,
               String aeronave, int limitePassageiros, List<Passageiro> passageiros) {
        this.prefixo = prefixo;
        this.origem = origem;
        this.destino = destino;
        this.dataHoraPartida = dataHoraPartida;
        this.dataHoraChegada = dataHoraChegada;
        this.aeronave = aeronave;
        this.limitePassageiros = limitePassageiros;
        this.passageiros = passageiros;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }

    public String getDataHoraPartida() {
        return dataHoraPartida;
    }

    public void setDataHoraPartida(String dataHoraPartida) {
        this.dataHoraPartida = dataHoraPartida;
    }

    public String getDataHoraChegada() {
        return dataHoraChegada;
    }

    public void setDataHoraChegada(String dataHoraChegada) {
        this.dataHoraChegada = dataHoraChegada;
    }

    public String getAeronave() {
        return aeronave;
    }

    public void setAeronave(String aeronave) {
        this.aeronave = aeronave;
    }

    public int getLimitePassageiros() {
        return limitePassageiros;
    }

    public void setLimitePassageiros(int limitePassageiros) {
        this.limitePassageiros = limitePassageiros;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }
}
