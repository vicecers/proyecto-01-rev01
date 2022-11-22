
package cerso.compras;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private double tamano;
    private int cm;

    private Monitor() {

        idMonitor = ++cm;

    }

    public Monitor(String m, double t) {
        this();
        this.marca = m;
        this.tamano = t;

    }

    public String getMarca() {

        return marca;
    }

    public double getTamano() {

        return tamano;
    }

    public void setTamano(double t) {

        this.tamano = t;
    }

    public void setMarca(String m) {
        this.marca = m;

    }

    public String toString() {

        return "\n[Dispositivo Entrada:Monitor]="+idMonitor+" "+ marca + " " + tamano+"\n";
    }
}
