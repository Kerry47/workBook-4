package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    Dealership dealership;

    public UserInterface(Dealership dealership) {
        this.dealership = dealership;
    }

    public UserInterface() {
    }

    public void display() {
        Dealership dealership = init();

        boolean displayIsRunning = true;

        Scanner scanner = new Scanner(System.in);

        while (displayIsRunning) {

            System.out.println("""
                    Welcome to the Home Screen!
                    Please Enter One of The Following Commands:
                    1) Get By Price
                    2) Get By Make
                    3) Get By Year
                    4) Get By Color
                    5) Get By Mileage
                    6) Get By Vehicle Type
                    7) Get All Vehicles
                    8) Add Vehicle
                    9) Remove Vehicle
                    """);

            int userInput = IO.getIntInput(scanner, "Pick a number");
            switch (userInput) {
                case 1 -> processGetByPriceRequest(scanner);
                case 2 -> processGetMakeModelRequest(scanner);
                case 3 -> processGetByYearRequest(scanner);
                case 4 -> processGetByColorRequest(scanner);
                case 5 -> processGetByMileageRequest(scanner);
                case 6 -> processGetByVehicleTypeRequest(scanner);
                case 7 -> processGetAllVehiclesRequest();
                case 8 -> processAddVehicleRequest(scanner);
                case 9 -> processRemoveVehicleRequest(scanner);
            }
        }
        scanner.close();
    }

    private Dealership init() {
        DealershipFileManager dfm = new DealershipFileManager();
        dealership = dfm.getDealership();
        return dealership;
    }

    public void processGetByPriceRequest(Scanner scanner) {
        ;
    }

    public void processGetMakeModelRequest(Scanner scanner) {
        ;
    }

    public void processGetByYearRequest(Scanner scanner) {
        ;
    }

    public void processGetByColorRequest(Scanner scanner) {
        ;
    }

    public void processGetByMileageRequest(Scanner scanner) {
        ;
    }

    public void processGetByVehicleTypeRequest(Scanner scanner) {

    }

    public void processGetAllVehiclesRequest() {
        displayVehicles((dealership.getAllVehicles()));
    }

    public void processAddVehicleRequest(Scanner scanner) {
        ;
    }

    public void processRemoveVehicleRequest(Scanner scanner) {
        ;
    }

    private static void displayVehicles(ArrayList<Vehicle> vehicles) {
        for (Vehicle x : vehicles) {
            System.out.println(x + "\n");
        }
    }
}


