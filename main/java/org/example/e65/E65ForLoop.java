package org.example.e65;

import java.util.Scanner;

public class E65ForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input=new Scanner(System.in);
        System.out.println("Int:");
        int x= input.nextInt();

        for(int i=x; i>=0;i--){
            System.out.print(i+" ");
        }


        // Prompt the user to enter a value for x


        // Use a for loop that starts with i = x - 1 and continues while i >= 0
        // Inside the loop, print the value of i followed by a space
    }
}
