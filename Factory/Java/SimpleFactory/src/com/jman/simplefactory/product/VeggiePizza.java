package com.jman.simplefactory.product;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Vegetables");
    }
}
