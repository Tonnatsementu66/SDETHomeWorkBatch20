package org.example.e143;

import org.example.e87.Car;

public class E143Constructor {

    static class Car {
        private String make;
        private String model;
        private int numberOfDoor;
        private int topSpeed;
        private double price;

        public Car(String make, String model, int numberOfDoor, int topSpeed, double price) {
            this.make = make;
            this.model = model;
            this.numberOfDoor = numberOfDoor;
            this.topSpeed = topSpeed;
            this.price = price;
        }

        public Car(String make, String model, int topSpeed, double price) {
            this(make,model,4,topSpeed,price);
        }

        public Car(int numberOfDoor, int topSpeed, double price) {
            this("unknown","unknown",numberOfDoor,topSpeed,price);


        }

        public Car(String make, String model, int numberOfDoor) {
            this(make, model, numberOfDoor, 90, 0);
        }

        public void display() {
            System.out.println(make + " " + model + " " + numberOfDoor + " " + topSpeed + " " + price);
        }


    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota","Prius",4,120,30000.0);
        Car car2=new Car("Toyota","Prius",4,30000.0);
        Car car3=new Car(4,120,30000.0);
        Car car4 = new Car("Toyota", "Prius", 4);
        car1.display();
        car2.display();
        car3.display();
        car4.display();

    }
}


