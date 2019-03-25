package sample;

import java.util.EventObject;

public class CocheEntratEvent extends EventObject {

    private int numeroCoches;

    public CocheEntratEvent(Object source,int numeroCoches) {
        super(source);
        this.numeroCoches = numeroCoches;
    }

    @Override
    public Object getSource() {
        return super.getSource();
    }

    public int getNumCoches() {
        return this.numeroCoches;
    }
}
