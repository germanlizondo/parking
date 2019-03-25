package sample;

import java.util.ArrayList;

public class Parking {
    private int maxPlazasCoche = 100;
    private int maxPlazasMoto = 200;
    private ArrayList<Coche> coches = new ArrayList<Coche>();
    private ArrayList<Moto> motos = new ArrayList<Moto>();
    private ArrayList<CocheListener> listenersCoche = new ArrayList<>();

    public Parking() {
    }



    public void anadirCoche(Coche coche){
        this.coches.add(coche);
    }



    public void avisaCocheEntrado(){

    }


    public void anadirObserverCoche(CocheListener cl){
        this.listenersCoche.add(cl);
    }

    public void eliminarObserverCoche(CocheListener cl){
        this.listenersCoche.remove(cl);
    }







    //GETTERS && SETTERS

    public int getMaxPlazasCoche() {
        return maxPlazasCoche;
    }

    public void setMaxPlazasCoche(int maxPlazasCoche) {
        this.maxPlazasCoche = maxPlazasCoche;
    }

    public int getMaxPlazasMoto() {
        return maxPlazasMoto;
    }

    public void setMaxPlazasMoto(int maxPlazasMoto) {
        this.maxPlazasMoto = maxPlazasMoto;
    }

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
