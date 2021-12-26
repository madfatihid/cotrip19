package com.cotrip.cotripjfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.stream.Collectors;

public class UserDashboard {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private ComboBox comboBox;
    @FXML
    private Label result;
    @FXML
    private Label reason;
    @FXML
    private Label welcome;
    @FXML
    private Label vaccinationStatus;
    @FXML
    private Slider vacc;

    @FXML
    protected void initialize() {
        ObservableList<String> data = FXCollections.observableArrayList(Variables.countryList.stream()
                .map(p -> p.getName())
                .collect(Collectors.toList()));
        comboBox.setItems(data);
        welcome.setText("Welcome, " + Variables.currentTourist.getName() + "!!");
        vaccinationStatus.setText("You have been vaccinated: ");
        vacc.setValue((double) Variables.currentTourist.getVacc());
        vacc.setOnMouseReleased(event -> {
            System.out.println(vacc.getValue());
            Variables.touristList.forEach(tourist -> {
                if (tourist == Variables.currentTourist) {
                    tourist.setVacc((int) vacc.getValue());
                }
            });
        });
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
    protected void confirm (ActionEvent event) throws Exception {
        System.out.println(comboBox.getValue());
        Country country = Variables.countryList.stream().filter(country1 -> country1.getName().equals(comboBox.getValue())).findFirst().get();
        if(country == null) return;
        if(Variables.currentTourist.getVacc() < 2 && country.isClosed()) {
            result.setText("Rejected");
            reason.setText("Reason: This country isn't safe yet and you have not met the required minimum dose of vaccination");
        }
        if(Variables.currentTourist.getVacc() < 2 && !country.isClosed()) {
            result.setText("Rejected");
            reason.setText("Reason: you have not met the required minimum dose of vaccination");
        }
        if(Variables.currentTourist.getVacc() == 2 && country.isClosed()) {
            result.setText("Rejected");
            reason.setText("Reason: This country isn't safe yet");
        }
        if(Variables.currentTourist.getVacc() == 2 && !country.isClosed()) {
            result.setText("Accepted");
            reason.setText("");
        }
    }

}
