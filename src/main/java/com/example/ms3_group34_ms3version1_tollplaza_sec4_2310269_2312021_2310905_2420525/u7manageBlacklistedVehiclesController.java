package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525;

import javafx.scene.control.*;

public class u7manageBlacklistedVehiclesController {
    @javafx.fxml.FXML
    private TableColumn blacklistReasonTC;
    @javafx.fxml.FXML
    private TableColumn driverLicenseTC;
    @javafx.fxml.FXML
    private TableColumn vehicleTypeTC;
    @javafx.fxml.FXML
    private TableColumn dateRegisteredTC;
    @javafx.fxml.FXML
    private TableView blacklistVehicleTV;
    @javafx.fxml.FXML
    private TableColumn vehicleLicenseTC;
    @javafx.fxml.FXML
    private TableColumn driveNameTC;
    @javafx.fxml.FXML
    private TextField driverNameTF;
    @javafx.fxml.FXML
    private TextField vehicleTpeTF;
    @javafx.fxml.FXML
    private TextField driverLicenseTF;

    public void setVehicleTypeTC(TableColumn vehicleTypeTC) {
        this.vehicleTypeTC = vehicleTypeTC;
    }

    @javafx.fxml.FXML
    private DatePicker dateRegisteredTF;
    @javafx.fxml.FXML
    private TextField vehicleLicenseTF;

    public void setAddToListBOA(Button addToListBOA) {
        this.addToListBOA = addToListBOA;
    }

    public TableColumn getBlacklistReasonTC() {
        return blacklistReasonTC;
    }

    public TableView getBlacklistVehicleTV() {
        return blacklistVehicleTV;
    }

    public u7manageBlacklistedVehiclesController(Button addToListBOA, TableColumn blacklistReasonTC, TableView blacklistVehicleTV, TableColumn dateRegisteredTC, DatePicker dateRegisteredTF, TableColumn driveNameTC, TableColumn driverLicenseTC, TextField driverLicenseTF, TextField driverNameTF, TableColumn driverNumberTC, TextField reasonTF, TableColumn vehicleLicenseTC, TextField vehicleLicenseTF, TextField vehicleTpeTF, TableColumn vehicleTypeTC) {
        this.addToListBOA = addToListBOA;
        this.blacklistReasonTC = blacklistReasonTC;
        this.blacklistVehicleTV = blacklistVehicleTV;
        this.dateRegisteredTC = dateRegisteredTC;
        this.dateRegisteredTF = dateRegisteredTF;
        this.driveNameTC = driveNameTC;
        this.driverLicenseTC = driverLicenseTC;
        this.driverLicenseTF = driverLicenseTF;
        this.driverNameTF = driverNameTF;
        this.driverNumberTC = driverNumberTC;
        this.reasonTF = reasonTF;
        this.vehicleLicenseTC = vehicleLicenseTC;
        this.vehicleLicenseTF = vehicleLicenseTF;
        this.vehicleTpeTF = vehicleTpeTF;
        this.vehicleTypeTC = vehicleTypeTC;
    }

    public void setBlacklistReasonTC(TableColumn blacklistReasonTC) {
        this.blacklistReasonTC = blacklistReasonTC;
    }

    public void setBlacklistVehicleTV(TableView blacklistVehicleTV) {
        this.blacklistVehicleTV = blacklistVehicleTV;
    }

    public void setDateRegisteredTC(TableColumn dateRegisteredTC) {
        this.dateRegisteredTC = dateRegisteredTC;
    }

    public void setDriveNameTC(TableColumn driveNameTC) {
        this.driveNameTC = driveNameTC;
    }

    public void setDriverLicenseTC(TableColumn driverLicenseTC) {
        this.driverLicenseTC = driverLicenseTC;
    }

    public void setDriverNumberTC(TableColumn driverNumberTC) {
        this.driverNumberTC = driverNumberTC;
    }

    public void setVehicleLicenseTC(TableColumn vehicleLicenseTC) {
        this.vehicleLicenseTC = vehicleLicenseTC;
    }

    public Button getAddToListBOA() {
        return addToListBOA;
    }

    public TableColumn getDateRegisteredTC() {
        return dateRegisteredTC;
    }

    public TableColumn getDriveNameTC() {
        return driveNameTC;
    }

    public TableColumn getDriverLicenseTC() {
        return driverLicenseTC;
    }

    public TableColumn getDriverNumberTC() {
        return driverNumberTC;
    }

    public TableColumn getVehicleLicenseTC() {
        return vehicleLicenseTC;
    }

    public TableColumn getVehicleTypeTC() {
        return vehicleTypeTC;
    }

    public void setDateRegisteredTF(DatePicker dateRegisteredTF) {
        this.dateRegisteredTF = dateRegisteredTF;
    }

    public void setDriverLicenseTF(TextField driverLicenseTF) {
        this.driverLicenseTF = driverLicenseTF;
    }

    public void setDriverNameTF(TextField driverNameTF) {
        this.driverNameTF = driverNameTF;
    }

    public void setReasonTF(TextField reasonTF) {
        this.reasonTF = reasonTF;
    }

    public void setVehicleLicenseTF(TextField vehicleLicenseTF) {
        this.vehicleLicenseTF = vehicleLicenseTF;
    }

    public void setVehicleTpeTF(TextField vehicleTpeTF) {
        this.vehicleTpeTF = vehicleTpeTF;
    }

    @Override
    public String toString() {
        return "u7manageBlacklistedVehiclesController{" +
                "addToListBOA=" + addToListBOA +
                ", blacklistReasonTC=" + blacklistReasonTC +
                ", driverLicenseTC=" + driverLicenseTC +
                ", vehicleTypeTC=" + vehicleTypeTC +
                ", dateRegisteredTC=" + dateRegisteredTC +
                ", blacklistVehicleTV=" + blacklistVehicleTV +
                ", vehicleLicenseTC=" + vehicleLicenseTC +
                ", driveNameTC=" + driveNameTC +
                ", driverNameTF=" + driverNameTF +
                ", vehicleTpeTF=" + vehicleTpeTF +
                ", driverLicenseTF=" + driverLicenseTF +
                ", dateRegisteredTF=" + dateRegisteredTF +
                ", vehicleLicenseTF=" + vehicleLicenseTF +
                ", reasonTF=" + reasonTF +
                ", driverNumberTC=" + driverNumberTC +
                '}';
    }

    @javafx.fxml.FXML
    private TextField reasonTF;
    @javafx.fxml.FXML
    private TableColumn driverNumberTC;
    @javafx.fxml.FXML
    private Button addToListBOA;
}
