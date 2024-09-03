package org.example.e144;

public class E144Constructor {
   static class StoreProduct{
      private String label;
       private double price;
       private String category;
       private boolean hasExpiration;
       private int stock;

       StoreProduct(String label,double price,String category,boolean hasExpiration,int stock){
           this.label=label;
           this.price=price;
           this.category=category;
           this.hasExpiration=hasExpiration;
           this.stock=stock;

       }
       StoreProduct(String label,double price,int stock){
           this(label,price,"misc",false,stock);
       }
       StoreProduct(String label,double price){
           this(label,price,0);
       }

       public void display(){
           System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
       }


   }
    public static void main(String[] args) {
       StoreProduct obj1=new StoreProduct("Eggs",3.0,"Produce",true,10);
       StoreProduct obj2=new StoreProduct("Paper Towel",2.0,24);
       StoreProduct obj3=new StoreProduct("Towel Paper",2.0);
       obj1.display();
       obj2.display();
       obj3.display();


    }
}
