package Parcial;

public class Telefonia {

    private int nLlamadas;
    private double duracionLlamada;
    private double costoLlamada;

    public Telefonia() {
    }

    public Telefonia(int nLlamadas, double duracionLlamada, double costoLlamada) {
        this.nLlamadas = nLlamadas;
        this.duracionLlamada = duracionLlamada;
        this.costoLlamada = costoLlamada;
    }

    public int getnLlamadas() {
        return nLlamadas;
    }

    public void setnLlamadas(int nLlamadas) {
        this.nLlamadas = nLlamadas;
    }

    public double getDuracionLlamada() {
        return duracionLlamada;
    }

    public void setDuracionLlamada(double duracionLlamada) {
        this.duracionLlamada = duracionLlamada;
    }

    public double getCostoLlamada() {
        return costoLlamada;
    }

    public void setCostoLlamada(double costoLlamada) {
        this.costoLlamada = costoLlamada;
    }

    @Override
    public String toString() {
        return "Telefonia{" +
                "nLlamadas=" + nLlamadas +
                ", duracionLlamada=" + duracionLlamada +
                ", costoLlamada=" + costoLlamada +
                '}';
    }
}
