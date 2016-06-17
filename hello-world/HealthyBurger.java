package com.javabrains;

/**
 * Created by sachin on 6/8/16.
 */
public class HealthyBurger extends Hamburger {
    private String HealthyExtraItem1;
    private double HealthyExtraItem1Price;
    private String HealthyExtraItem2;
    private double HealthyExtraItem2Price;
    public HealthyBurger(String meat, double price) {

        super("Brown rye Bread roll",meat, price);
    }
    public void addHealthyExtraItem1(String itemName,int number,double itemPrice){

        double priceToSet=this.getPrice();

        priceToSet=priceToSet+(itemPrice*number);

       this.setPrice(priceToSet);
    }
    public void addHealthyExtraItem2(String itemName,int number,double itemPrice){

        double priceToSet=this.getPrice();

        priceToSet=priceToSet+(itemPrice*number);

        this.setPrice(priceToSet);
    }

    @Override
    public void getBasePrice() {
        super.getBasePrice();
        if(HealthyExtraItem1 !=null){
            System.out.println("The "+this.HealthyExtraItem1+" additon:"+this.HealthyExtraItem1Price);
            System.out.println("\n");
        }
        if(HealthyExtraItem2 !=null){
            System.out.println("The "+this.HealthyExtraItem2+" additon:"+this.HealthyExtraItem2Price);
            System.out.println("\n");
        }
        System.out.println("The New Grand Total for Healthy Burger is: "+getPrice());
    }
}
