package com.students.data;

import java.util.Scanner;

public class Main {

    public static void main(String [] a){
        int option = 0;
        Scanner s = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        do{
            System.out.println("\nMENU");
            System.out.println("1. Add New Student");
            System.out.println("2. Print All Students");
            System.out.println("3. Sort All Students by Name");
            System.out.println("4. EXIT");

            System.out.print("\nOption > ");
            if(s.hasNextInt()){
                option = s.nextInt();
            }

            switch (option){
                case 1:
                    manager.add(manager.newStudent());
                    break;
                case 2:
                    manager.printAll();
                    break;
                case 3:
                    manager.sortbyName();
                    manager.printAll();
                    break;
                case 4:
                    option = -1;
                    System.out.println("Exiting...");
                    //s.close();
                    break;
                default:
                    System.out.println("Error! Not a valid option");
            }
        }while(option != -1);

    }
}
