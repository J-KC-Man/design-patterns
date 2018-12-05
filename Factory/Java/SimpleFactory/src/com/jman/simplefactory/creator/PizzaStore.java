package com.jman.simplefactory.creator;

import com.jman.simplefactory.product.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
