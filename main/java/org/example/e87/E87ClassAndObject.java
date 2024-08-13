package org.example.e87;

public class E87ClassAndObject {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.carColor="Black";
        car1.carYear=2019;
        car1.carMake="BMW";

        car1.color();
        car1.year();
        car1.make();



        Car car2=new Car();
        car2.carColor="White";
        car2.carYear=2018;
        car2.carMake="Toyota";
        car2.color();
        car2.year();
        car2.make();
        // Create a class named 'Car'

        // Declare a String variable named 'carColor'
        // Declare an integer variable named 'carYear'
        // Declare a String variable named 'carMake'

        // Create the first object of the class 'Car'

        // Assign the value "Black" to the 'carColor' variable of the first object
        // Assign the value 2019 to the 'carYear' variable of the first object
        // Assign the value "BMW" to the 'carMake' variable of the first object

        // Create the second object of the class 'Car'

        // Assign the value "White" to the 'carColor' variable of the second object
        // Assign the value 2018 to the 'carYear' variable of the second object
        // Assign the value "Toyota" to the 'carMake' variable of the second object

        // Print the values of the properties for both objects in the specified format



    }
}
