package com.jman.factory;


import com.jman.factory.creator.NYPizzaStore;
import com.jman.factory.creator.PizzaStore;
import com.jman.factory.product.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nystore = new NYPizzaStore();

        Pizza pizza = nystore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");



    }
}
