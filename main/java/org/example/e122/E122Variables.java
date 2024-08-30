package org.example.e122;

public class E122Variables {
    // Declare 3 instance variables: name of the country, capital, and population size
    String nameOfTheCountry;
    String capital;
    int population;

    void info(){
        System.out.println("The capital of "+nameOfTheCountry+ " is "+capital+ " and population is "+population );
    }

    // Create a method to display values of instance variables

    public static void main(String[] args) {
        E122Variables obj=new E122Variables();

        obj.nameOfTheCountry="USA";
        obj.capital="Washington";
        obj.population=33000000;
        obj.info();

        E122Variables obj2=new E122Variables();
        obj2.nameOfTheCountry="Kazakhstan";
        obj2.capital="Astana";
        obj2.population=1850000;
        obj2.info();


        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Execute the method to display values for the first instance
        // Assign values to variables for the second instance
        // Execute the method to display values for the second instance
    }
}
