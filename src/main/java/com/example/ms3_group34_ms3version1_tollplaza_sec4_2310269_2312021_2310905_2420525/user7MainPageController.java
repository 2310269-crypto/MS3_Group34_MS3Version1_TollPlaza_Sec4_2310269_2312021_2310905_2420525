package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;
import java.io.IOException;


public class user7MainPageController {


    @javafx.fxml.FXML
    public void U7blacklistedVehiclesBOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("u7manageBlacklistedVehicles.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Manage Blacklisted Vehicles");
        stage.show();
    }

    @javafx.fxml.FXML
    public void U7incidentReportBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void U7suspeciousVehicleBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void U7staffAccessBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void U7emergencyBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void U7reportBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void U7cctvBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void U7unauthorizedLaneAccessBOA(ActionEvent actionEvent) {
    }
}
