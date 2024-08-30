package org.example.e121;

public class E121Variables {
    // Declare 3 instance variables: integer, double, and char
    int number;
    double weight;
    char letter;
    void info(){
        System.out.println(number+"\n" +weight+ "\n"+ letter);

    }

    public static void main(String[] args) {
        E121Variables str=new E121Variables();
        str.number=10;
        str.weight=10.23;
        str.letter='a';
        str.info();



        E121Variables str2=new E121Variables();
        str2.number=100;
        str2.weight=100.23;
        str2.letter='s';
        str2.info();



        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Print values of the first instance
        // Assign values to variables for the second instance
        // Print values of the second instance
    }
}
