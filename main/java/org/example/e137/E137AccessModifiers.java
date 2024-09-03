package org.example.e137;

public class E137AccessModifiers {
    private String name;
    String city;
    protected String school_name;
    public int batch_number;
    public void display(){
        System.out.println("My name is " +name+ " and I live in " +city+ "." + "I study at " + school_name + " in batch " + batch_number);
    }



    public static void main(String[] args) {
        E137AccessModifiers obj=new E137AccessModifiers();
        obj.name="John";
        obj.city="Miami";
        obj.school_name="Syntax";
        obj.batch_number=9;
        obj.display();

    }
}

