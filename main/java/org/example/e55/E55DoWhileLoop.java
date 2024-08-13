package org.example.e55;

import java.util.Scanner;

public class E55DoWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan=new Scanner(System.in);

        // Declare a variable for user input
        int favoriteNumber;

        do{
        System.out.println("Please enter your favorite number");
        // Capture the user's input and store it in the variable
        favoriteNumber = scan.nextInt();
        // Print "You entered: " followed by the value of the variable
        System.out.println("You entered:"+favoriteNumber);
        }
        while(favoriteNumber<7);{
        System.out.println("You entered 7! Loops ends");}



        // Print "You've entered 7! Loop ends."
    }
}
