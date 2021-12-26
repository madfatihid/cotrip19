package com.cotrip.cotripjfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.stream.Collectors;

public class AdminDashboard {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private ListView<Country> list;
    @FXML
    private TextField nameField;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;

    @FXML
    protected void initialize() {
        ObservableList<Country> data = FXCollections.observableArrayList(Variables.countryList);
        list.setItems(data);
    }

    @FXML
    protected void logout (ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void delete (ActionEvent event) {
        Country selected = list.getSelectionModel().getSelectedItem();
        int index = list.getSelectionModel().getSelectedIndex();
        System.out.println(selected);
        Variables.countryList.removeIf(country -> country.equals(selected));
        list.getItems().remove(index);
    }
    @FXML
    protected void add (ActionEvent event) throws IOException {
        String name = nameField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();
        if(name.isBlank() || username.isBlank() || password.isBlank()) return;
        if(Variables.countryList.stream()
                .filter(country -> country.getName().equals(nameField.getText()))
                .findAny()
                .isPresent()) return;
        if(Variables.countryList.stream()
                .filter(country -> country.getUsername().equals(usernameField.getText()))
                .findAny()
                .isPresent()) return;
        Variables.countryList.add(new Country(username, password, name,false));
        ObservableList<Country> data = FXCollections.observableArrayList(Variables.countryList);
        list.setItems(data);
        nameField.setText("");
        usernameField.setText("");
        passwordField.setText("");
    }
}
