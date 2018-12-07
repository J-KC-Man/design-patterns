package creator.ingredientFactories;

import creator.ingredients.cheese.Cheese;
import creator.ingredients.clams.Clams;
import creator.ingredients.dough.Dough;
import creator.ingredients.pepperoni.Pepperoni;
import creator.ingredients.sauce.Sauce;
import creator.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
