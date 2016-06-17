package com.javabrains;

/**
 * Created by sachin on 6/8/16.
 */
public class Main {
    public static void main(String[] args){
        Hamburger burger= new HealthyBurger("brown",12.00);
        burger.addAdditionalItem1("tomato",1,3.2);
        burger.addAdditionalItem2("lettuce",1,1.2);
        burger.addAdditionalItem3("carrot",1,4.2);
        burger.getBasePrice();
        Hamburger burger1=new DeluxeBurger("white",12.00);
        burger1.getBasePrice();
        System.out.println("just for a commit");

    }
}
