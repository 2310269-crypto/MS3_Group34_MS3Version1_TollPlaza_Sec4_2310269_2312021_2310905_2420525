package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class user8MainPageController {
    @FXML
    private Button U8lostReceiptsBOA;
    @FXML
    private Label U8laneNumberLabel;
    @FXML
    private ComboBox <String> U8vehicleTypeCB;

    public Label getU8fareLabel() {
        return U8fareLabel;
    }

    public Label getU8laneNumberLabel() {
        return U8laneNumberLabel;
    }

    public void setU8createReportBOA(Button u8createReportBOA) {
        U8createReportBOA = u8createReportBOA;
    }

    public void setU8customerComplaintBOA(Button u8customerComplaintBOA) {
        U8customerComplaintBOA = u8customerComplaintBOA;
    }

    public void setU8customerProfileRegisterBOA(Button u8customerProfileRegisterBOA) {
        U8customerProfileRegisterBOA = u8customerProfileRegisterBOA;
    }

    public void setU8customerProfileUpdateBOA(Button u8customerProfileUpdateBOA) {
        U8customerProfileUpdateBOA = u8customerProfileUpdateBOA;
    }


    public void setU8lostReceiptsBOA(Button u8lostReceiptsBOA) {
        U8lostReceiptsBOA = u8lostReceiptsBOA;
    }

    public void setU8tollRefundsBOA(Button u8tollRefundsBOA) {
        U8tollRefundsBOA = u8tollRefundsBOA;
    }

    public void setU8vipVehiclesBOA(Button u8vipVehiclesBOA) {
        U8vipVehiclesBOA = u8vipVehiclesBOA;
    }

    public void setU8locationCB(ComboBox<String> u8locationCB) {
        U8locationCB = u8locationCB;
    }

    @FXML
    private Label U8fareLabel;
    @FXML
    private Button U8customerProfileRegisterBOA;
    @FXML
    private Button U8customerProfileUpdateBOA;
    @FXML
    private Button U8customerComplaintBOA;





    @FXML
    private Button U8createReportBOA;
    @FXML
    private Button U8tollRefundsBOA;
    @FXML
    private Button U8vipVehiclesBOA;
    @FXML
    private ComboBox <String> U8locationCB;



    @Override
    public String toString() {
        return "user8MainPageController{" +
                "U8createReportBOA=" + U8createReportBOA +
                ", U8lostReceiptsBOA=" + U8lostReceiptsBOA +
                ", U8laneNumberLabel=" + U8laneNumberLabel +
                ", U8fareLabel=" + U8fareLabel +
                ", U8customerProfileRegisterBOA=" + U8customerProfileRegisterBOA +
                ", U8customerProfileUpdateBOA=" + U8customerProfileUpdateBOA +
                ", U8customerComplaintBOA=" + U8customerComplaintBOA +
                ", U8tollRefundsBOA=" + U8tollRefundsBOA +
                ", U8vipVehiclesBOA=" + U8vipVehiclesBOA +
                ", U8locationCB=" + U8locationCB +
                '}';
    }
    @FXML
    public  void initialize() {
        U8vehicleTypeCB.getItems().addAll("Car", "Bike", "Bus", "Truck");
        U8locationCB.getItems().addAll("Mawa", "Janjira");

        U8vehicleTypeCB.setOnAction(e -> outputLaneaAndFare());
        U8locationCB.setOnAction(e -> outputLaneaAndFare());
    }
        private void outputLaneaAndFare () {
            String vehicle = U8vehicleTypeCB.getValue();
            String location = U8locationCB.getValue();

            if (vehicle == null || location == null) return;

            U8laneNumberLabel.setText(outputLaneNumber(vehicle, location));
            U8fareLabel.setText(outputFare(vehicle, location) + " tk");

        }


        private String outputLaneNumber(String vehicle,String location) {
            String lane = null;
                if (location.equals("Mawa")) {
                    lane = "1";
                }
                if (location.equals("Janjira")) {
                    lane = "3";
                }
                return lane;
            }

        private String outputFare(String vehicle,String location) {
            String fare = null;
                if (vehicle.equals("Car")) {
                    fare = "750";
                }
                if (vehicle.equals("Bus")) {
                    fare = "1900";
                }
                if (vehicle.equals("Bike")) {
                    fare = "100";
                }
                if (vehicle.equals("Truck")) {
                    fare = "3500";
                }


                return fare;
            }}









