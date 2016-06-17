package com.javabrains;

/**
 * Created by sachin on 6/8/16.
 */
public class Hamburger {
    private String rollType;
    private String meat;
    private double price;
    private int tomatoes=0;
    private int lettuce=0;
    private int carrot=0;
    private double basePrice=12.00;
    private String additionalItem1;
    private double additionalItem1Price;
    private String additionalItem2;
    private double additionalItem2Price;
    private String additionalItem3;
    private double additionalItem3Price;

    public double getAdditionalItem1Price() {
        return additionalItem1Price;
    }

    public double getAdditionalItem2Price() {
        return additionalItem2Price;
    }

    public double getAdditionalItem3Price() {
        return additionalItem3Price;
    }

    public Hamburger(String rollType, String meat, double price) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addAdditionalItem1(String itemName,int number,double itemPrice){
            this.price=this.price+(itemPrice*number);
            this.additionalItem1=itemName;
            this.additionalItem1Price=itemPrice;
      }
    public void addAdditionalItem2(String itemName,int number,double itemPrice){
        this.price=this.price+(itemPrice*number);
        this.additionalItem2=itemName;
        this.additionalItem2Price=itemPrice;
    }
    public void addAdditionalItem3(String itemName,int number,double itemPrice){
        this.price=this.price+(itemPrice*number);
        this.additionalItem3=itemName;
        this.additionalItem3Price=itemPrice;
    }
    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }
   public void getBasePrice(){
       System.out.println("The Burger Price: "+this.basePrice);
       System.out.println("\n");
       if(this.additionalItem1 != null){
       System.out.println("The "+this.additionalItem1+" additon:"+this.additionalItem1Price);
       System.out.println("\n");
       }
       if(this.additionalItem2 != null){
           System.out.println("The "+this.additionalItem2+" additon:"+this.additionalItem2Price);
           System.out.println("\n");
       }
       if(this.additionalItem3 != null){
           System.out.println("The "+this.additionalItem3+" additon:"+this.additionalItem3Price);
           System.out.println("\n");
       }
       else{
           System.out.println("No addition:0");
           System.out.println("\n");
       }
       System.out.println("The Grand Total is: "+getPrice());
       System.out.println("The Grand Total is: "+getPrice());

   }
}
