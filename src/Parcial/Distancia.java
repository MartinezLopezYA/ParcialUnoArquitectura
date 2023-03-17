package Parcial;

public class Distancia extends Telefonia{

    public double costoDistancia;

    public Distancia() {
    }

    public Distancia(int nLlamadas, double duracionLlamada, double costoLlamada, double costoDistancia) {
        super(nLlamadas, duracionLlamada, costoLlamada);
        this.costoDistancia = costoDistancia;
    }

    public double getCostoDistancia() {
        return costoDistancia;
    }

    public void setCostoDistancia(double costoDistancia) {
        this.costoDistancia = costoDistancia;
    }

    @Override
    public String toString() {
        return super.toString() + "Distancia{" +
                "costoDistancia=" + costoDistancia +
                '}';
    }
}
