package org.example.e82;

public class E82NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given pattern values
        String[][] pattern = {
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"}
        };

        // Use nested loops to iterate through the 2D array and print the pattern
        for(String[]patter:pattern){
            for(String pat:patter){
                System.out.print(pat+" ");

            }

            System.out.println();
        }

    }
}
