package org.example.e145;

import org.example.e88.Dog;
public class E145ThisKeyword {

   static class Dog {

        String dogName;
        double dogWeight;
        static String dogBreed = "Mutt";

       public Dog(String dogName, double dogWeight) {
            this.dogName = dogName;
            this.dogWeight = dogWeight;
        }

       public void Display() {
            System.out.println(dogName + " " + dogBreed + " " + dogWeight);
        }

    }
    public static void main(String[] args) {
        Dog obj = new Dog("Tarzan",50.0);
        Dog obj1 = new Dog("lucy",10.0);
        obj.Display();
        obj1.Display();
    }
}




