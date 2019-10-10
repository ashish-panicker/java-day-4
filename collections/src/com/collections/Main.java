package com.collections;

import java.util.*;

public class Main {

    List<String> names;

    public Main(){
        names = new ArrayList<>();
    }

    public static  void main(String [] args){
        int option = 0;
        String name = null;

        Scanner s = new Scanner(System.in);
        Main m = new Main();
        do{
            System.out.println("\nMENU");
            System.out.println("1. New name");
            System.out.println("2. Remove name");
            System.out.println("3. Print Names");
            System.out.println("4. Search Name");
            System.out.println("5. Sort Names");
            System.out.println("6. Edit Name");
            System.out.println("7. Exit");

            System.out.print("\nOption > ");
            option = s.nextInt();
            switch (option){
                case 1:
                        System.out.print("\nEnter Name: ");
                        name = s.next();
                        m.add(name);
                    break;
                case 2:
                    System.out.print("\nEnter Name: ");
                    name = s.next();
                    m.remove(name);
                    break;
                case 3:
                    m.printAll();
                    break;
                case 4:
                    System.out.print("\nEnter Name: ");
                    name = s.next();
                    m.find(name);
                    break;
                case 5:
                    m.sort();
                    break;
                case 6:
                    System.out.print("\nEnter Name: ");
                    name = s.next();
                    System.out.print("\nEnter updated name: ");
                    String newName = s.next();
                    m.edit(name, newName);
                    break;
                case 7:
                    option = -1;
                    System.out.println("Exiting...");
                    break;
                default:
            }
        }while ( option != -1);
        s.close();
    }

    public void add(String name){
        names.add(name);
        System.out.printf("%d name(s) in the list.\n", names.size());
    }

    public void remove(String name){
        if(names.remove(name))
            System.out.printf("%s removed from the list\n", name);
        else
            System.out.printf("%s not found in the list\n", name);
        System.out.printf("%d name(s) in the list.\n", names.size());
    }

    public void find(String name){
        int index = names.indexOf(name);
        if(index != -1)
            System.out.printf("%s found at position %d.\n", name, index);
        else
            System.out.printf("Sorry!. Cannot find %s in the list.\n", name);
    }

    public void sort(){
        Collections.sort(names);
        System.out.println("List sorted. Printing now.");
        printAll();
    }

    public void edit(String name, String newName){
        int index = names.indexOf(name);
        if(index != -1){
            names.set(index, newName);
            System.out.printf("Success!. %s updated at position %d.\n", name,index);
        }else{
            System.out.printf("Sorry!. Cannot find %s in the list.\n", name);
        }

    }
    public void printAll(){
        for (String name :names) {
            System.out.println(name);
        }
    }

}
