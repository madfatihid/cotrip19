package com.cotrip.cotripjfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class UserLogin {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;

    @FXML
    protected void back(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void usercreate(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("user-create.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void login(ActionEvent event) throws IOException {
        System.out.println(usernameField.getText());
        System.out.println(passwordField.getText());
        System.out.println(Variables.touristList);
        if(Variables.touristList.stream()
                .filter(tourist -> tourist.getUsername().equals(usernameField.getText()))
                .filter(tourist -> tourist.getPassword().equals(passwordField.getText()))
                .findAny()
                .isEmpty()){
            System.out.println("no credential matched");
            return;
        }
        System.out.println("credential found");
        Variables.currentTourist = Variables.touristList.stream()
                .filter(tourist -> tourist.getUsername().equals(usernameField.getText()))
                .filter(tourist -> tourist.getPassword().equals(passwordField.getText()))
                .findFirst().get();

        root = FXMLLoader.load(getClass().getResource("user-dashboard.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}