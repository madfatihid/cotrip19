package com.cotrip.cotripjfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class CountryDashboard {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private RadioButton open;
    @FXML
    private RadioButton closed;
    @FXML
    private ToggleGroup group;

    @FXML
    private Label welcome;

    @FXML
    protected void initialize() {
        welcome.setText("Welcome, " + Variables.currentCountry.getName() + "!!");
        if(Variables.currentCountry.isClosed()) {
            closed.setSelected(true);
        } else {
            open.setSelected(true);
        }

        group.selectedToggleProperty().addListener(
            (observable, oldToggle, newToggle) -> {
                RadioButton selectedRadioButton = (RadioButton) newToggle;
                String toggleGroupValue = selectedRadioButton.getText();
                if (toggleGroupValue.equals("Open")) {
                    Variables.countryList.forEach(country -> {
                        if (country == Variables.currentCountry) {
                            country.setClosed(false);
                        }
                    });
                } else if (toggleGroupValue.equals("Closed")) {
                    Variables.countryList.forEach(country -> {
                        if (country == Variables.currentCountry) {
                            country.setClosed(true);
                        }
                    });
//                } else {
//                    gender = '?';
                }
            }
        );
    }

    @FXML
    protected void logout (ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
