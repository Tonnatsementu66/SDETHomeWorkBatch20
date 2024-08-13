package org.example.e40;

import java.util.Scanner;

public class E40SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Print prompt for user to enter the name of the instructor
        System.out.println("Enter the name of the instructor");
        // Capture the instructor name input
        String instructorName = input.next();
        switch (instructorName) {

            // Determine the responsibility based on the instructor's name using a switch statement
            // If the name is "Asghar"
            //    Set responsibility to "Will take care of Java Assignment"
            case "Asghar":
                System.out.println("Will take care of Java Assignment");
                break;
            // If the name is "Moazzam"
            //    Set responsibility to "Will take care of SDLC Assignment"
            case "Moazzam":
                System.out.println("Will take care of SDLC Assignment");
                break;
            // If the name is "Weqas"
            //    Set responsibility to "Will take care of Selenium Assignment"
            case "Wegas":
                System.out.println("Will take care of Selenium Assignment");
                break;
            // If the name is "Asel"
            //    Set responsibility to "Will take care of every Assignment"
            case "Asel":
                System.out.println("Will take care of every Assignment");
                break;
            default:
                System.out.println("Invalid instructor name");

                // For any other name
                //    Set responsibility to "Invalid instructor selected"

                // Print the responsibility
        }
    }
}
