package com.yearup;


import java.util.Scanner;

public class VehicleInventory {
    private static Vehicle[] vehicles = new Vehicle[20];

    public static void main(String[] args) {


        Vehicle vehicle1 = new Vehicle(111343, "Honda", "Red", 138900, 12500);
        Vehicle vehicle2 = new Vehicle(143564, "Honda CRV", "blue", 12230, 18000);
        Vehicle vehicle3 = new Vehicle(135677, "Acura MDX", "Red", 12500, 12900);
        Vehicle vehicle4 = new Vehicle(178898, "Toyota", "Silver", 187000, 150000);
        Vehicle vehicle5 = new Vehicle(145666, "BMW", "White", 107000, 6000);
        Vehicle vehicle6 = new Vehicle(167767, "BMW", "Grey", 10000, 199999);
        int count = 6;

        Scanner input = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("Find vehicles that match make and model");
            System.out.println("Find vehicle that fall within a price range");
            System.out.println("Find vehicles that match color");
            System.out.println("List all vehicles");
            System.out.println("Add a vehicle");
            System.out.println("Quit");
            System.out.println("Make Your Selection:");


            String command = input.nextLine();

            switch (command) {
                case "1":
                    System.out.print("Find a vehicles that matches make and Model");
                    String getmakemodel = input.nextLine();
                    break;

                case "2":
                    System.out.println("Find vehciles that Falls Within Price range");
                    String getPrice = input.nextLine();
                    break;
                case "3":
                    System.out.println("Find Vehicles That Matches Color");
                    String getColor = input.nextLine();
                    break;
                case "4":
                    System.out.println("List all Vehicles");
                    for (int i = 3; i < count; i++) {
                        System.out.println(vehicles[i]);

                    }
                    break;
                case "5":
                    System.out.println("Add a vehicle");


                    break;
                case "6":
                    System.out.println("Quit");
                    break;


            }

        }
    }
}

