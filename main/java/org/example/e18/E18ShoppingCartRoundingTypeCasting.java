package org.example.e18;

public class E18ShoppingCartRoundingTypeCasting {
    public static void main(String[] args) {
        // Declare the double variables and assign values
        double item1=19.99;
        double item2=29.75;
        double item3=4.99;


        // Calculate total cost
        double totalCost=item1+item2+item3;


        // Type cast the double to an int to round it down
        int num1=20;
        int num2=29;
        int num3=5;


        int roundedCost=num1+num2+num3;


        // Print the results
        System.out.println("The origial total cost is " + totalCost);
        System.out.println("The original rounded cost is " + roundedCost);

    }
}
