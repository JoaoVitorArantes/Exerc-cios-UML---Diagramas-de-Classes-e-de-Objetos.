
public class Escala {
    private Voo voo;
    private int poltrona;

    public Escala(Voo voo, int poltrona) {
        this.voo = voo;
        this.poltrona = poltrona;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }
}
