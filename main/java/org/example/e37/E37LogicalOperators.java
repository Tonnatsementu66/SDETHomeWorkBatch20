package org.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);

        // Print prompt for user to answer if they are thirsty
        System.out.println("Are you thirsty(true/false)");
        // Capture the thirsty input
        boolean isThirsty= input.nextBoolean();

        // Print prompt for user to answer if they are sleepy
        System.out.println("Are you sleepy");
        // Capture the sleepy input
        boolean isSleepy= input.nextBoolean();

        // Determine the drink based on the inputs
        // If user is thirsty and not sleepy
        //    Set drink to "water"
        if(isThirsty&&!isSleepy){
            System.out.println("Look like you need to drink water");
        }
        // If user is thirsty and sleepy
        //    Set drink to "coffee"
        else if(isThirsty&&isSleepy){
            System.out.println("Look like you need to drink  coffee");
        }
        // If user is not thirsty and sleepy
        //    Set drink to "tea"
        else if(!isThirsty&&isSleepy){
            System.out.println("Look like you need to drink tea");
        }
        // Otherwise
        //    Set drink to "nothing"
        else{
            System.out.println("look like you need to drink nothing");
        }

        // Print the drink suggestion
        // Output: Looks like you need to drink ___
    }
}
