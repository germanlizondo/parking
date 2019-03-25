package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    //COCHE
    private Parking parkingCoche = new Parking();
    private MarcadorCoche marcadorCoche  = new MarcadorCoche() ;

    //MOTOS
    private Parking parkingMotos = new Parking();
    private MarcadorCoche marcadorMotos  = new MarcadorCoche() ;


    //COCHE
    @FXML
    private Button restarCoche;

    @FXML
    private Button sumarCoche;

    @FXML
    private Label numCocheLabel;



    @FXML
    private Circle circleCoche;


    //MOTOS
    @FXML
    private Button restarMoto;

    @FXML
    private Button sumarMoto;

    @FXML
    private Label numMotosLabel;

    @FXML
    private Circle circleMotos;



    public void entrarCoche(ActionEvent actionEvent){

        parkingCoche.anadirCoche(new Coche());
        this.numCocheLabel.setText(marcadorCoche.getNumeroPlazasLibres()+"");
        if(marcadorCoche.getNumeroPlazasLibres() < marcadorCoche.getNumeroPlazas()){
            restarCoche.setDisable(false);
        }
        if(marcadorCoche.getNumeroPlazasLibres() <= 0){
            circleCoche.setFill(Paint.valueOf("Red"));
            sumarCoche.setDisable(true);

        }else {
            circleCoche.setFill(Paint.valueOf("#2bff00"));
        }

    }


    public void salirCoche(ActionEvent actionEvent){

        parkingCoche.salirCoche(0);
        this.numCocheLabel.setText(marcadorCoche.getNumeroPlazasLibres()+"");
         if(marcadorCoche.getNumeroPlazasLibres() < marcadorCoche.getNumeroPlazas()){
            restarCoche.setDisable(false);
        }else if(marcadorCoche.getNumeroPlazasLibres() == marcadorCoche.getNumeroPlazas()){
             restarCoche.setDisable(true);
         }
        if(marcadorCoche.getNumeroPlazasLibres() >= 0){
            circleCoche.setFill(Paint.valueOf("#2bff00"));
        sumarCoche.setDisable(false);

        }

        else {
            circleCoche.setFill(Paint.valueOf("#Red"));
        }

    }


    public void salirMoto(ActionEvent actionEvent) {

        parkingMotos.salirCoche(0);
        this.numMotosLabel.setText(marcadorMotos.getNumeroPlazasLibres()+"");
        if(marcadorMotos.getNumeroPlazasLibres() < marcadorMotos.getNumeroPlazas()){
            restarMoto.setDisable(false);
        }else if(marcadorMotos.getNumeroPlazasLibres() == marcadorMotos.getNumeroPlazas()){
            restarMoto.setDisable(true);
        }
        if(marcadorMotos.getNumeroPlazasLibres() >= 0){
            circleMotos.setFill(Paint.valueOf("#2bff00"));
            sumarMoto.setDisable(false);

        }

        else {
            circleMotos.setFill(Paint.valueOf("#Red"));
        }
    }

    public void entrarMoto(ActionEvent actionEvent) {

        parkingMotos.anadirCoche(new Coche());
        this.numMotosLabel.setText(marcadorMotos.getNumeroPlazasLibres()+"");
        if(marcadorMotos.getNumeroPlazasLibres() < marcadorMotos.getNumeroPlazas()){
            restarMoto.setDisable(false);
        }
        if(marcadorMotos.getNumeroPlazasLibres() <= 0){
            circleMotos.setFill(Paint.valueOf("Red"));
            sumarMoto.setDisable(true);

        }else {
            circleMotos.setFill(Paint.valueOf("#2bff00"));
        }
    }

    @FXML
    public void initialize() {
        marcadorCoche.setNumeroPlazas(10);
        parkingCoche.anadirObserverCoche(marcadorCoche);
        this.numCocheLabel.setText(marcadorCoche.getNumeroPlazasLibres()+"");


        marcadorMotos.setNumeroPlazas(5);
        parkingMotos.anadirObserverCoche(marcadorMotos);
        this.numMotosLabel.setText(marcadorMotos.getNumeroPlazasLibres()+"");
        circleMotos.setFill(Paint.valueOf("#2bff00"));


        restarCoche.setDisable(true);
        restarMoto.setDisable(true);

    }


}
