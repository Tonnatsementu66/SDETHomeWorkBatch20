package org.example.e116;

public class E116JavaMethods {
    public static void main(String[] args) {
        // Call the bothEven method with various arguments to test the method
        bothEven(20,37);
    }
    public static void bothEven(int a,int b){
        if(a%2==0 && b%2==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }


    // Create method bothEven with two integer parameters
    // Inside the method, check if both numbers are even
    // Return true if both numbers are even, otherwise return false
}
