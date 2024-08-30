package org.example.e120;

public class E120Variables {
    // Declare 3 instance variables: year, school name, and batch number
    int year;
    String schoolName;
    int batch;
    void info(){
        System.out.println("I am a student of batch "+batch+" studying at "+schoolName+ " in the year of "+year );
    }

    public static void main(String[] args) {
        E120Variables c=new E120Variables();
        c.year=2020;
        c.batch=6;
        c.schoolName="Syntax";
        c.info();


        // Access variables from the main method and assign specific values to them
        // Print values of your variables in the specified format
    }
}
