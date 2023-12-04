package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    Button btnNewVente,btnFermerVente;

    public void switchToComptable(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("comptable.fxml"));
        stage = (Stage)btnFermerVente.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public  void switchToNouvelVente(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("nouvelle_vente.fxml"));
        stage = (Stage)btnNewVente.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

//    public  void switchToDecaissemnt(ActionEvent event) throws IOException {
//
//        Parent root = FXMLLoader.load(getClass().getResource("decaissement.fxml"));
//        stage = (Stage)decaissement.getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
}