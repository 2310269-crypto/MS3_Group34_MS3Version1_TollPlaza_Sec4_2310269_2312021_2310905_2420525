package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.StringConverter;

import java.net.URL;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;


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
    private TableColumn <String,Blacklist> driverNumberTC;
    @javafx.fxml.FXML
    private DatePicker dateRegisteredTF;
    @javafx.fxml.FXML
    private TextField vehicleLicenseTF;

    private ObservableList<Blacklist> blacklistData = initializeData();
    private ObservableList<Blacklist> initializeData(){
        Blacklist p1 = new Blacklist(LocalDate.parse("2026-05-23"),"122345tyu","john doe","01234567798","carrying illegal object","erty34627","Car");
        Blacklist p2 = new Blacklist(LocalDate.parse("2026-05-29"),"123445tyu","jane doe","01758908598","Trespassing","ryht33849","Car");

        return FXCollections.observableArrayList(p1,p2);

    }


    public void initialize(URL url, ResourceBundle resourceBundle) {
        String pattern = "yyyy/MM/dd";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        dateRegisteredTF.setConverter(new StringConverter<LocalDate>() {
            public String toString(LocalDate date) {
                if (date != null) {
                    return formatter.format(date);
                } else {
                    return null;
                }

            }

            public LocalDate fromString(String string) {
                return null;
            }


        });
        vehicleLicenseTC.setCellValueFactory(new PropertyValueFactory<String,Blacklist>("vehicleLicense")) ;
        driverNameTC.setCellValueFactory(new PropertyValueFactory<String,Blacklist>("driverName")) ;
        driverLicenseTC.setCellValueFactory(new PropertyValueFactory<String,Blacklist>("driverLicense")) ;
        driverNumberTC.setCellValueFactory(new PropertyValueFactory<String,Blacklist>("driverNumber"));
        vehicleTypeTC.setCellValueFactory(new PropertyValueFactory<String,Blacklist>("vehicleType"));
        blacklistReasonTC.setCellValueFactory(new PropertyValueFactory<String,Blacklist>("reasons"));
        dateRegisteredTC.setCellValueFactory(new PropertyValueFactory<LocalDate,Blacklist>("dateRegistered"));

        blacklistVehicleTV.setItems(blacklistData);
        }

    @FXML
    public void addToListBOA(ActionEvent actionEvent) {
       System.out.println("add button pressed");

       String vehicleLicense = vehicleLicenseTF.getText();
       String driverName = driverNameTF.getText();
       String driverLicense = driverLicenseTF.getText();
       String driverNumber = driverNameTF.getText();
       String vehicleType = vehicleTpeTF.getText();
       String reason = reasonTF.getText();
       LocalDate dateRegistered = dateRegisteredTF.getValue();

       Blacklist newVehicle = new
               Blacklist(
                       dateRegistered,
                       vehicleLicense,
                       driverName,
                       driverLicense,
                       driverNumber,
                       vehicleType,
                       reason

       );
        blacklistData.add(newVehicle);
         System.out.println("list sise" + blacklistData.size());
    }





        ;




        };






