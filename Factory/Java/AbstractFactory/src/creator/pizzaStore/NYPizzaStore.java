package creator.pizzaStore;

import creator.ingredientFactories.NYPizzaIngredientFactory;
import creator.ingredientFactories.PizzaIngredientFactory;
import product.*;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;

        /*
        * The Ny Store is composed with a NY pizza ingredient factory.
        * This will be used to produce the ingredients for all NY Style
        * pizzas.
        * */
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        // you could replace the following conditionals with a switch statement
        if(item.equals("cheese")) {

            // We now pass each pizza the factory that should be used to
            // produce its ingredients.
            // For each Pizza, we instantiate a new Pizza and give it the
            // factory it needs to get its ingredients
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }
        else if(item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        else if(item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }

        return pizza;
    }
}
