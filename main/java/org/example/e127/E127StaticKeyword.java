package org.example.e127;

public class E127StaticKeyword {

    public static void main(String[] args) {
        E127StaticKeyword obj=new E127StaticKeyword();
        E127StaticKeyword.printstatic();
        obj.print();

        // Call the non-static method using the instance


        // Call the static method using the class name
    }
    void print(){
        System.out.println("Programming is amazing");
    }
    static void printstatic(){
        System.out.println("Java is awesome");
    }

    // Create a non-static method to print "Programming is amazing."

    // Create a static method to print "Java is awesome."
}
