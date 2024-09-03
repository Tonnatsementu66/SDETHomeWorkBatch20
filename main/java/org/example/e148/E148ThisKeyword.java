package org.example.e148;

public class E148ThisKeyword {
    public static class ShoppingStore{
        private String item;
        private double price;
        private int quantity;

        public ShoppingStore(String item,double price,int quantity){
            this.item=item;
            this.price=price;
            this.quantity=quantity;
        }
        public double itemTotalPrice(){
            double totalPrice=price*quantity;
            System.out.println(item+"Total Value "+totalPrice);
            return totalPrice;
        }





    }
    public static void main(String[] args){
        ShoppingStore item=new ShoppingStore("Blanket",49.99,2);
        ShoppingStore item1=new ShoppingStore("Mattress",219.59,2);


        double total1=item.itemTotalPrice();
        double total2=item1.itemTotalPrice();
        double totalSum=total1+total2;
        System.out.println("You purchased "+totalSum+ " Today");

        }


    }
   