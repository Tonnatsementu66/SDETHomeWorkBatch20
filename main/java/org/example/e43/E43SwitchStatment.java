package org.example.e43;

import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);

        // Print prompt for user to enter their electricity usage in kWh
        System.out.println("Please enter your electricity esage in kWh");
        // Capture the usage input
        int usage= input.nextInt();

        // Calculate bill using switch statement
        // Case 0-100
        //    Multiply usage by $0.12 per kWh
        switch(usage){
            case 0-100:
                System.out.println("Your electricity bill is $" + (usage*0.12));
                break;
            case 102-200:
                System.out.println("Your electricity bill is $" + usage*0.15);
                break;
            case 201-300:
                System.out.println("Your electricity bill is $"+ usage*0.20);
                break;
            case 301:
                System.out.println("Your electricity bill is $" +usage*0.25);
                break;
            default:
                System.out.println("Invalid usage entered");













        }



        // Case 101-200
        //    Multiply usage by $0.15 per kWh
        // Case 201-300
        //    Multiply usage by $0.20 per kWh
        // Case 301 and above
        //    Multiply usage by $0.25 per kWh
        // Default
        //    Print "Invalid usage entered"

        // Print the bill
        // Output: Your electricity bill is $____

    }
}
