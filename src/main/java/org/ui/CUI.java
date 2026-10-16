package org.ui;

import org.domain.IVehicle;
import org.service.Service;
import java.util.Scanner;

public class CUI implements IUI {
    Scanner scanner;
    private Service service;

    private static void printMenu(){
        System.out.println("Menu");
        System.out.println("1.Add a vehicle");
        System.out.println("2.Remove a vehicle");
        System.out.println("3.Display all vehicles");
        System.out.println("4.Display red vehicles");
        System.out.println("0.Exit");
    }

    private static void printArray(IVehicle[] vehicles){
        if(vehicles == null || vehicles.length == 0){
            System.out.println("There are no vehicles to display");
            return;
        }
        for(int i = 0; i < vehicles.length; i++){
            System.out.println((i + 1) + "." + vehicles[i].toString());
        }
    }

    private String readString(String prompt){
        System.out.print(prompt);
        return scanner.next();
    }

    private Integer readInteger(String prompt){
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public CUI(Service service){
        this.service = service;
        scanner = new Scanner(System.in);
    }
    @Override
    public void start() {}

    @Override
    public void run() {
        boolean exited = false;
        String cmd, type, brand, color;
        Integer id;
        while(!exited){
            printMenu();
            cmd = readString("Enter command: ");
            switch(cmd){
                case "1":
                    type = readString("Type:");
                    id = readInteger("ID:");
                    brand = readString("Brand:");
                    color = readString("Color:");
                    try{
                        service.add(type, id, brand, color);
                        System.out.println("Vehicle added successfully!");
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "2":
                    id = readInteger("ID:");
                    try {
                        service.remove(id);
                        System.out.println("Vehicle removed successfully!");
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "3":
                    printArray(service.getAll());
                    break;
                case "4":
                    printArray(service.getAllRed());
                    break;
                case "0":
                    exited = true;
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }

        System.out.println("Bye bye!");
    }
}
