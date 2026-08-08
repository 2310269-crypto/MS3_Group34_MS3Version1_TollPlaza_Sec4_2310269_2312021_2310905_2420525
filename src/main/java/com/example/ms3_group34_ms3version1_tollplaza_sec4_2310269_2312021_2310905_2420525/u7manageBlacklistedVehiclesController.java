package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.StringConverter;

import java.net.URL;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

//for importing files to csv//
import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
    private TableColumn <String, Blacklist> driverNameTC;
    @javafx.fxml.FXML
    private TextField reasonTF;
    @javafx.fxml.FXML
    private TableColumn <String,Blacklist> driverNumberTC;
    @javafx.fxml.FXML
    private DatePicker dateRegisteredTF;
    @javafx.fxml.FXML
    private TextField vehicleLicenseTF;
    @FXML
    private Button addToListBOA;
    @FXML
    private TextField driverNumberTF;

    private static final String CSV_FILE = "blacklist_data.csv";
    private ObservableList<Blacklist> blacklistData = initializeData();

    private ObservableList<Blacklist> initializeData(){
        ObservableList<Blacklist> data = FXCollections.observableArrayList();
        File file = new File(CSV_FILE);

        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.isBlank()) continue;
                    try {
                        String[] f = parseCsvLine(line);
                        data.add(new Blacklist(LocalDate.parse(f[0]), f[1], f[2], f[3], f[4], f[5], f[6]));
                    } catch (Exception e) {
                        System.out.println("Skipping bad CSV row: " + line);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            Blacklist p1 = new Blacklist(LocalDate.parse("2026-05-23"),"122345tyu","john doe","01234567798","carrying illegal object","erty34627","Car");
            Blacklist p2 = new Blacklist(LocalDate.parse("2026-05-29"),"123445tyu","jane doe","01758908598","Trespassing","ryht33849","Car");
            data.add(p1);
            data.add(p2);
            saveAllToCSV(data);
        }
        return data;
    }

    private void appendToCSV(Blacklist b) {
        File file = new File(CSV_FILE);
        System.out.println("Writing CSV to: " + file.getAbsolutePath());
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_FILE, true))) {
            writer.write(toCsvLine(b));
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveAllToCSV(ObservableList<Blacklist> data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_FILE, false))) {
            for (Blacklist b : data) {
                writer.write(toCsvLine(b));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String toCsvLine(Blacklist b) {
        return String.join(",",
                b.getDateRegistered().toString(),
                escape(b.getDriverLicense()),
                escape(b.getDriverName()),
                escape(b.getDriverNumber()),
                escape(b.getReasons()),
                escape(b.getVehicleLicense()),
                escape(b.getVehicleType())
        );
    }

    private String escape(String value) {
        if (value == null) return "";
        if (value.contains(",") || value.contains("\"")) {
            return "\"" + value.replace("\"", "\"\"") + "\"";
        }
        return value;
    }

    private String[] parseCsvLine(String line) {
        List<String> fields = new ArrayList<>();
        StringBuilder cur = new StringBuilder();
        boolean inQuotes = false;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (inQuotes) {
                if (c == '"') {
                    if (i + 1 < line.length() && line.charAt(i + 1) == '"') { cur.append('"'); i++; }
                    else inQuotes = false;
                } else cur.append(c);
            } else {
                if (c == '"') inQuotes = true;
                else if (c == ',') { fields.add(cur.toString()); cur.setLength(0); }
                else cur.append(c);
            }
        }
        fields.add(cur.toString());
        return fields.toArray(new String[0]);
    }

    public void initialize() {
        System.out.println("initialize() called, blacklistData size = " + blacklistData.size());

        String pattern = "yyyy/MM/dd";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        dateRegisteredTF.setConverter(new StringConverter<LocalDate>() {
            public String toString(LocalDate date) {
                return date != null ? formatter.format(date) : null;
            }
            public LocalDate fromString(String string) {
                if (string == null || string.isBlank()) {
                    return null;
                }
                try {
                    return LocalDate.parse(string, formatter);
                } catch (Exception e) {
                    return null;
                }
            }
        });

        vehicleLicenseTC.setCellValueFactory(new PropertyValueFactory<>("vehicleLicense"));
        driverNameTC.setCellValueFactory(new PropertyValueFactory<>("driverName"));
        driverLicenseTC.setCellValueFactory(new PropertyValueFactory<>("driverLicense"));
        driverNumberTC.setCellValueFactory(new PropertyValueFactory<>("driverNumber"));
        vehicleTypeTC.setCellValueFactory(new PropertyValueFactory<>("vehicleType"));
        blacklistReasonTC.setCellValueFactory(new PropertyValueFactory<>("reasons"));
        dateRegisteredTC.setCellValueFactory(new PropertyValueFactory<>("dateRegistered"));

        blacklistVehicleTV.setItems(blacklistData);
        System.out.println("setItems called, TableView items size = " + blacklistVehicleTV.getItems().size());
    }
        @FXML
        public void addToListBOA(ActionEvent actionEvent) {
           System.out.println("add button pressed");

           String vehicleLicense = vehicleLicenseTF.getText();
           String driverName = driverNameTF.getText();
           String driverLicense = driverLicenseTF.getText();
           String driverNumber = driverNumberTF.getText();
           String vehicleType = vehicleTpeTF.getText();
           String reasons = reasonTF.getText();
           LocalDate dateRegistered = dateRegisteredTF.getValue();

            Blacklist newVehicle = new Blacklist(
                    dateRegistered, driverLicense, driverName, driverNumber, reasons, vehicleLicense, vehicleType
            );
            blacklistData.add(newVehicle);
            appendToCSV(newVehicle);   // <-- new line: persist immediately
            System.out.println("list size " + blacklistData.size());

        }

    @FXML
    public void backToMP1BOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("user7MainPage.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Main Page");
        stage.show();
    }



            ;




            };






