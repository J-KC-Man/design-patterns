package product;

import creator.ingredients.cheese.Cheese;
import creator.ingredients.clams.Clams;
import creator.ingredients.dough.Dough;
import creator.ingredients.pepperoni.Pepperoni;
import creator.ingredients.sauce.Sauce;
import creator.ingredients.veggies.Veggies;

public abstract class Pizza {

    String name;

    /*
    * Each pizza holds a set of ingredients that are used in its preparation
    *
    * In the Factory method code we had a NYCheesePizza and a ChicagoCheesePizza class
    * The only difference is the use of regional ingredients
    * Both variants are made the same way
    *
    * we don't really need two classes of each pizza; the ingredient
    * factory is going to handle the regional differences for us
    */
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

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        // code to print pizza here
        return "A " + this.name;
    }
}
