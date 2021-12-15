package com.cotrip.cotripjfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class UserCreate {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private TextField name;
    @FXML
    private Slider vacc;

    @FXML
    protected void back(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("user-login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void create(ActionEvent event) throws IOException {
        Variables.touristList.add(new Tourist(username.getText(), password.getText(), name.getText(), (int) vacc.getValue()));

        root = FXMLLoader.load(getClass().getResource("user-login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
