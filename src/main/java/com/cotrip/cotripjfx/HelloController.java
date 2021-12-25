package com.cotrip.cotripjfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    protected void imTourist(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("user-login.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void imCountry(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("user-login.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void imAdmin(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("user-login.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}