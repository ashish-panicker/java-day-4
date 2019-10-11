package com;

import java.util.Scanner;

public class Main {

    public static void main(String [] a){

        Main m = new Main();
        try{
            m.vote();
        }catch (InvalidAgeException ie){
            System.err.println(ie.getMessage());
        }

    }

    public void vote() throws InvalidAgeException {
        int age = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter age: ");
        age = s.nextInt();
        if(age < 18){
            //exception
            throw new InvalidAgeException("Age has to be at least 18.");
        }
        System.out.print("Congratulations!\n You can vote.");
    }
}
