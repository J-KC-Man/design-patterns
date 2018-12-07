package com.jman.simplefactory.creator;

import com.jman.simplefactory.product.Pizza;
// this class will be made abstract with default implementation
public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        // this line will be changed in factory pattern
        // createPizza() will be moved to be in the Pizza store class
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }


}
