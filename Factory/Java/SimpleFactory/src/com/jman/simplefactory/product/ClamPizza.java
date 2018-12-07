package com.jman.simplefactory.product;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Clams");
    }
}
