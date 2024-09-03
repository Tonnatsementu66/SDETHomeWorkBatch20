package org.example.e139;

public class E139AccessModifiers {

    public static String replaceSpaces(String str){
    return str.replace(' ','_');}


    public static void main(String[] args) {
        System.out.println("replaceSpasces(\"hello worls\")==> " +replaceSpaces("hello world"));

        System.out.println("replaceSpaces(\"java is fun\")==> " +replaceSpaces("java is fun"));

        System.out.println("replaceSpaces(\"i love coding\")==> " +replaceSpaces("i love coding"));

    }
}




