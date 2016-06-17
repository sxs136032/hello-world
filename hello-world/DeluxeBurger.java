package com.javabrains;

/**
 * Created by sachin on 6/8/16.
 */
public class DeluxeBurger extends Hamburger {



    public DeluxeBurger(String meat, double price) {
        super("BrownRye", meat, price);
        super.addAdditionalItem1("chips",1,2.75);
        super.addAdditionalItem2("drinks",1,1.75);

    }

    @Override
    public void addAdditionalItem1(String itemName, int number, double itemPrice) {
        System.out.println("Connot add additional items for deluxe burger");
    }

    @Override
    public void addAdditionalItem2(String itemName, int number, double itemPrice) {
        System.out.println("Connot add additional items for deluxe burger");
    }

    @Override
    public void addAdditionalItem3(String itemName, int number, double itemPrice) {
        System.out.println("Connot add additional items for deluxe burger");
    }
}
