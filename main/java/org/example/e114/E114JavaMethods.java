package org.example.e114;

public class E114JavaMethods {
    public static void main(String[] args) {
        // Call the add method with arguments that add up to 30
        add(10,20);
        multiply(3,10);
        sub(10,30);

        // Call the multiply method with arguments that multiply to 30

        // Call the subtract method with arguments that subtract to 20

    }
    public static void add(int a,int b){
        int result=a+b;
        System.out.println("Adition "+result);
    }
    public static void multiply(int a,int b){
        int result=a*b;
        System.out.println("Multiplication "+result);
    }
    public static void sub(int a,int b){
        int result=b-a;
        System.out.println("Substraction "+result);
    }

    // Create method multiply with two integer parameters and a print statement to display the result

    // Create method add with two integer parameters and a print statement to display the result

    // Create method subtract with two integer parameters and a print statement to display the result

}
