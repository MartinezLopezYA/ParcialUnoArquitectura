package Parcial;

public class Celular extends Telefonia{

    private double costoCelular;

    public Celular() {
    }

    public Celular(int nLlamadas, double duracionLlamada, double costoLlamada, double costoCelular) {
        super(nLlamadas, duracionLlamada, costoLlamada);
        this.costoCelular = costoCelular;
    }

    public double getCostoCelular() {
        return costoCelular;
    }

    public void setCostoCelular(double costoCelular) {
        this.costoCelular = costoCelular;
    }

    @Override
    public String toString() {
        return super.toString() + "Celular{" +
                "costoClular=" + costoCelular +
                '}';
    }
}
