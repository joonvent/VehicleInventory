package com.yearup;


import java.util.Scanner;

public class VehicleInventory {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] vehiceInventory = new String[20];

        vehiceInventory[1] = " 232564 , Honda Civic , Silver , 15250 ,17000 ";
        vehiceInventory[2] = " 143564 , Honda CRV , blue , 12230 , 18000 ";
        vehiceInventory[3] = " 176287 , Honda HRV , Black , 14000, 22000";
        vehiceInventory[4] = " 990191 , Honda Accord , Silver , 12300, 18000";
        vehiceInventory[5] = " 888322 , Acura MDX , Black , 18999, 23500";
        vehiceInventory[6] = " 876232 , Acura ILX , Black , 16500, 21200";

        System.out.println(vehiceInventory[2]);

        String command = input.nextLine();

        switch (command) {
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:

            case 6:


                boolean exit = false;
                while (!exit) {
                    System.out.println("Find vehicles that match make and model");
                    System.out.println("Find vehicle that fall within a price range");
                    System.out.println("Find vehicles that match color");
                    System.out.println("List all vehicles");
                    System.out.println("Add a vehicle");
                    System.out.println("Quit");

                    }


                }

        }
    }
}
