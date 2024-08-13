package org.example.e72;

import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input=new Scanner(System.in);
        String[] daysOfWeek=new String[7];
        for(int i=0; i< daysOfWeek.length;i++){
            System.out.println("Enter day " +(i+1)+ " of the week");
            daysOfWeek[i]= input.nextLine();
        }

        System.out.println("The days of the week are:");
        for(int i=0;i< daysOfWeek.length;i++){
            System.out.println(daysOfWeek[i]);
        }


        // Create an array of strings with size 7


        // Use a loop to prompt the user to input the days of the week one by one and store each input in the array

        // Use another loop to iterate through the array and print each value on a new line

        // Create a Scanner object to read input from the console



    }
}
