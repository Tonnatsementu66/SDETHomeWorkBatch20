package org.example.e129;

public class E129StaticKeyword {

    public static void main(String[] args) {
        E129StaticKeyword obj=new E129StaticKeyword();
        obj.name="Morroco";
        obj.continent="Africa";
        obj.print();


    }
    static String name;
    static String continent;
    void print(){
        System.out.println(name+" located on "+continent+" continent");
    }
}
