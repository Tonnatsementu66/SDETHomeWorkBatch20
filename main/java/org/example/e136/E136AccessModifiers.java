package org.example.e136;

import org.example.e133.E133StaticKeyword;

public class E136AccessModifiers {
    private void privateMethod(){
        System.out.println("This is Private Method");
    }
    void defaultMethod(){
        System.out.println("This is Default Method");
    }
    protected void protectedMethod(){
        System.out.println("This is Protected Method");
    }
    public  void publicMethod(){
        System.out.println("This is Public Method");
    }


    public static void main(String[] args) {
        E136AccessModifiers p=new E136AccessModifiers();
        p.privateMethod();
        p.defaultMethod();
        p.protectedMethod();
        p.publicMethod();




    }
}


