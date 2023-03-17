package Parcial;

import java.util.Scanner;

public class Local extends Telefonia{

    private double costoLocal;

    public Local() {
    }

    public Local(int nLlamadas, double duracionLlamada, double costoLlamada, double costoLocal) {
        super(nLlamadas, duracionLlamada, costoLlamada);
        this.costoLocal = costoLocal;
    }

    public double getCostoLocal() {
        return costoLocal;
    }

    public void setCostoLocal(double costoLocal) {
        this.costoLocal = costoLocal;
    }

    @Override
    public String toString() {
        return super.toString() + "Local{" +
                "costoLocal=" + costoLocal +
                '}';
    }
}
