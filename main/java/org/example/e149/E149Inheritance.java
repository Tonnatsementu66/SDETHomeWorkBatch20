package org.example.e149;

public class E149Inheritance {
    public static class Vehicle {
        String make;
        int year;

        public void displayInfo() {
            System.out.println("Vehicle: " + make+"," +" Year: " + year);
        }

        public static class Car extends Vehicle {
            String model;

            public void displayCarInfo() {
                System.out.println("Model: "+model);
            }
        }


        public static void main(String[] args) {
            Car obj = new Car();
            obj.make="Toyota";
            obj.year=2020;
            obj.model="Corolla";
            obj.displayInfo();
            obj.displayCarInfo();

        }
    }
}
