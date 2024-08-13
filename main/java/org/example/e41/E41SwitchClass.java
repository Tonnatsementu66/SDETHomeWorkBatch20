package org.example.e41;

import java.util.Scanner;

public class E41SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Print prompt for user to enter the time of day
        System.out.println("Enter the time of day(morning,afternoon,evening,night)");
        // Capture the time of day input
        String timeOfDay = input.next();
        switch (timeOfDay) {

            // Recommend meal using switch statement
            // Case "morning"
            //    Print "Recommended meal: Breakfast"
            case "morning":
                System.out.println("Recommended meal:Breakfast");
                break;

            // Case "afternoon"
            //    Print "Recommended meal: Lunch"
            case "afternoon":
                System.out.println("Recommended meal:Lunch");
                break;
            // Case "evening"
            //    Print "Recommended meal: Dinner"
            case "evening":
                System.out.println("Recommended meal:Dinner");
                // Case "night"
                //    Print "Recommended meal: Snack"
            case "night":
                System.out.println("Recommended meal:Snack");
                break;
            // Default
            //    Print "Invalid time of day entered"
            default:
                System.out.println("Invalid time of day entered");
        }
    }
}
