package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525;

import java.time.LocalDate;

public class Blacklist {

    private String driverName,driverLicense,vehicleLicense,vehicleType,reasons;
    private int driverNumber;
    private LocalDate dateRegistered;

    public Blacklist(LocalDate dateRegistered, String driverLicense, String driverName, int driverNumber, String reasons, String vehicleLicense, String vehicleType) {
        this.dateRegistered = dateRegistered;
        this.driverLicense = driverLicense;
        this.driverName = driverName;
        this.driverNumber = driverNumber;
        this.reasons = reasons;
        this.vehicleLicense = vehicleLicense;
        this.vehicleType = vehicleType;
    }

    public LocalDate getDateRegistered() {
        return dateRegistered;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getDriverNumber() {
        return driverNumber;
    }

    public String getReasons() {
        return reasons;
    }

    public String getVehicleLicense() {
        return vehicleLicense;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "Blacklist{" +
                "dateRegistered=" + dateRegistered +
                ", driverName='" + driverName + '\'' +
                ", driverLicense='" + driverLicense + '\'' +
                ", vehicleLicense='" + vehicleLicense + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", reasons='" + reasons + '\'' +
                ", driverNumber=" + driverNumber +
                '}';
    }




    }

