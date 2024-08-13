package org.example.e44;

import javax.xml.transform.Source;
import java.util.Scanner;

public class E44SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Print prompt for user to enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)
        System.out.println("Enter the type of meal( 1 for breakfast,2 for lunch,3 for dinner");
        // Capture the meal type input
        int mealType = input.nextInt();
        switch (mealType) {

            // Calculate price using switch statement
            // Case 1
            //    Set price to $5.00
            case 1:
                System.out.println("The price for your meal is $5.00");
                break;
            // Case 2
            //    Set price to $10.00
            case 2:
                System.out.println("The price for your meal is $10.00");
                break;
            // Case 3
            //    Set price to $15.00
            case 3:
                System.out.println("The price for your meal is $ 15.00");
                break;
            // Default
            //    Print "Invalid meal type entered"
            default:
                System.out.println("Invalid meal type entered");

                // Print the price
                // Output: The price of your meal is $____
        }


    }

}
