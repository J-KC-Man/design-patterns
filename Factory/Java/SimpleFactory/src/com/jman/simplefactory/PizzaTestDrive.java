package com.jman.simplefactory;

import com.jman.simplefactory.creator.NYPizzaStore;
import com.jman.simplefactory.creator.PizzaStore;
import com.jman.simplefactory.product.NYStyleCheesePizza;
import com.jman.simplefactory.product.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nystore = new NYPizzaStore();

        Pizza pizza = nystore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");



    }
}
