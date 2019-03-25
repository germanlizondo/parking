package sample;

import java.util.EventObject;

public class MarcadorCoche implements CocheListener {

    private int numeroPlazas;
    private int numeroPlazasOcupadas = 0;
    private int numeroPlazasLibres;

    public MarcadorCoche() {
    }

    @Override
    public void cocheEntra(CocheEntratEvent cocheEntratEvent) {
        this.numeroPlazasOcupadas = cocheEntratEvent.getNumCoches();

        this.numeroPlazasLibres = numeroPlazas - numeroPlazasOcupadas;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public int getNumeroPlazasLibres() {
        return numeroPlazasLibres;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
        this.numeroPlazasLibres =  this.numeroPlazas;

    }

    public int getNumeroPlazasOcupadas() {
        return numeroPlazasOcupadas;
    }

    public void setNumeroPlazasOcupadas(int numeroPlazasOcupadas) {
        this.numeroPlazasOcupadas = numeroPlazasOcupadas;
    }

    public void setNumeroPlazasLibres(int numeroPlazasLibres) {
        this.numeroPlazasLibres = numeroPlazasLibres;
    }
}
