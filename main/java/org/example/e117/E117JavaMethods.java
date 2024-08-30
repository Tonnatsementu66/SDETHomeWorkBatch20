package org.example.e117;

public class E117JavaMethods {
    public static void main(String[] args) {
        // Call the sumEvenToX method with various arguments to test the method
        System.out.println("sumEvenTox("+ sumEvenTox(5)+")==>" + sumEvenTox(5));

        System.out.println("sumEvenTox("+sumEvenTox(8)+")==>" + sumEvenTox(8));

    }
        static int sumEvenTox(int x){
            int sum=0;
        for (int i = 2; i <= x; i=i+2) {
                sum =sum+ i;

            }
        return sum;


    }

}

    // Create method sumEvenToX with an integer parameter (x)
    // Inside the method, calculate the sum of even integers from 1 to x
    // Return the calculated su
