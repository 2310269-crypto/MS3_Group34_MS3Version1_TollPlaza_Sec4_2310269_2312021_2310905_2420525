package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class u7manageBlacklistedVehiclesController {
    @javafx.fxml.FXML
    private TableColumn <String, Blacklist> blacklistReasonTC;
    @javafx.fxml.FXML
    private TableColumn <String, Blacklist> driverLicenseTC;
    @javafx.fxml.FXML
    private TableColumn <String, Blacklist> vehicleTypeTC;
    @javafx.fxml.FXML
    private TableColumn <LocalDate,Blacklist> dateRegisteredTC;
    @javafx.fxml.FXML
    private TableView <Blacklist> blacklistVehicleTV;
    @javafx.fxml.FXML
    private TableColumn <String, Blacklist> vehicleLicenseTC;
    @javafx.fxml.FXML
    private TextField driverNameTF;
    @javafx.fxml.FXML
    private TextField vehicleTpeTF;
    @javafx.fxml.FXML
    private TextField driverLicenseTF;
    @javafx.fxml.FXML
    private TextField driverLicenseTF1;
    @javafx.fxml.FXML
    private TableColumn <String, Blacklist> driverNameTC;
    @javafx.fxml.FXML
    private TextField reasonTF;
    @javafx.fxml.FXML
    private TableColumn <Integer,Blacklist> driverNumberTC;

    public void setVehicleTypeTC(TableColumn vehicleTypeTC) {
        this.vehicleTypeTC = vehicleTypeTC;
    }

    @javafx.fxml.FXML
    private DatePicker dateRegisteredTF;
    @javafx.fxml.FXML
    private TextField vehicleLicenseTF;

    public TableColumn <String,Blacklist> getBlacklistReasonTC() {
        return blacklistReasonTC;
    }

    public TableView getBlacklistVehicleTV() {
        return blacklistVehicleTV;
    }


    @javafx.fxml.FXML
    public void addToListBOA(ActionEvent actionEvent) {
    }
}
