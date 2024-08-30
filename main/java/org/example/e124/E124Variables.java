package org.example.e124;

public class E124Variables {
    // Declare a static variable at the class level
    static String ss = "Welcome To Syntax Technologies";

    public static void main(String[] args) {
        E124Variables obj=new E124Variables();
        System.out.println(obj.ss);
        System.out.println(ss);
        System.out.println(E124Variables.ss);

        // Access and print the static variable using three different methods
        // 1. By calling directly

        // 2. By using the class name

        // 3. By creating an object of the class
    }
}
