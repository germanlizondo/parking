package sample;

import java.util.ArrayList;

public class Parking {
    private ArrayList<Coche> coches = new ArrayList<Coche>();
    private ArrayList<Moto> motos = new ArrayList<Moto>();
    private ArrayList<CocheListener> listenersCoche = new ArrayList<>();

    public Parking() {
    }

    public void anadirCoche(Coche coche){
        this.coches.add(coche);
        this.avisaCocheEntrado(this.coches.size());
    }

    public void salirCoche(int coche){
        this.coches.remove(coche);
        this.avisaCocheEntrado(this.coches.size());
    }



    public void avisaCocheEntrado(int numeroCoches){

        CocheEntratEvent cocheEntratEvent = new CocheEntratEvent(this,numeroCoches);

        for (CocheListener listener: this.listenersCoche) {
            listener.cocheEntra(cocheEntratEvent);
        }
    }


    public void anadirObserverCoche(CocheListener cl){
        this.listenersCoche.add(cl);
    }

    public void eliminarObserverCoche(CocheListener cl){
        this.listenersCoche.remove(cl);
    }







    //GETTERS && SETTERS


    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public void setCoches(ArrayList<Coche> coches) {
        this.coches = coches;
    }

    public ArrayList<Moto> getMotos() {
        return motos;
    }

    public void setMotos(ArrayList<Moto> motos) {
        this.motos = motos;
    }
}
