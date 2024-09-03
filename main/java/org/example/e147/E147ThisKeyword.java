package org.example.e147;

public class E147ThisKeyword {
    public static class CarObject{
       private String model;
       private double price;
       private int quantity;

       public CarObject(String model,double price,int quantity){
           this.model=model;
           this.price=price;
           this.quantity=quantity;
       }
       public void carStockValue(){
           double sum=0;
           sum=(price*quantity);
           System.out.println(model+" "+"Stock Value "+sum);
       }

    }

    public static void main(String[] args) {
        CarObject car1=new CarObject("Toyota 2019",50000.00,50);
        CarObject car2=new CarObject("BMW 2010",10883.00,60);
        car1.carStockValue();
        car2.carStockValue();


    }
}
