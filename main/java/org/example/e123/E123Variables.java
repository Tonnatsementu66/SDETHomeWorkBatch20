package org.example.e123;

public class E123Variables {
    // Declare instance variables to hold integer, String, double, boolean, and float values
    int intValue;
    String stringValue;
    double doubleValue;
    boolean booleanValue;
    float floatValue;
    void info(){
        System.out.print(intValue+"\n"+stringValue+"\n"+doubleValue+"\n"+booleanValue+"\n"+floatValue);
    }

    public static void main(String[] args) {
        // Create an instance of the class
        // Access instance variables and print them without assigning any values
        E123Variables obj=new E123Variables();
        obj.info();
    }
}
