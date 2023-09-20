
import java.util.List;

public class Passagem {
    private String codigoReserva;
    private double valor;
    private Passageiro cliente;
    private List<Escala> escalas;

    public Passagem(String codigoReserva, double valor, Passageiro cliente, List<Escala> escalas) {
        this.codigoReserva = codigoReserva;
        this.valor = valor;
        this.cliente = cliente;
        this.escalas = escalas;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Passageiro getCliente() {
        return cliente;
    }

    public void setCliente(Passageiro cliente) {
        this.cliente = cliente;
    }

    public List<Escala> getEscalas() {
        return escalas;
    }

    public void setEscalas(List<Escala> escalas) {
        this.escalas = escalas;
    }
}

