package org.example.e81;

public class E81Arrays {
    public static void main(String[] args) {
                // Declare and initialize the 2D array with the given values
                int[][] a = {
                        {-5, -2, -3, 7},
                        {1, -5, -2, 2},
                        {1, -2, 3, -4}
                };

                // Initialize a variable to store the sum
                int sum = 0;

                // Use nested loops to iterate through the 2D array
                for (int i = 0; i < a.length; i += 2) {
                    for (int j = 0; j < a[i].length; j += 2) {
                        sum += a[i][j];
                    }
                }

                // Print the calculated sum
                System.out.println(sum);
            }
        }






