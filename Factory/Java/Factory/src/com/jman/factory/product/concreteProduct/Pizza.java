package com.jman.factory.product.concreteProduct;

public abstract class Pizza {

    String name;

    // Each pizza holds a set of ingredients that are used in its preparation
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    // the prepare method is now abstract.
    // The ingredients will be collected from the ingredient factory
    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        // code to print pizza here
    }
}
