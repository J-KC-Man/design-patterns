package com.jman.simplefactory;

import com.jman.simplefactory.creator.PizzaStore;
import com.jman.simplefactory.creator.SimplePizzaFactory;
import com.jman.simplefactory.product.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");



    }
}
