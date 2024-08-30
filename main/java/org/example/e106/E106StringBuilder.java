package org.example.e106;

public class E106StringBuilder {
    public static void main(String[] args) {
        StringBuilder  sb=new StringBuilder();
        sb.append("Hello");
        sb.append("World");
        String upperCase=sb.toString().toUpperCase();
        System.out.println(upperCase);



    }
}
