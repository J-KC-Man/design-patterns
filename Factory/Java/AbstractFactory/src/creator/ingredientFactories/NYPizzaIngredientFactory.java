package creator.ingredientFactories;

import creator.ingredients.cheese.Cheese;
import creator.ingredients.cheese.ReggianoCheese;
import creator.ingredients.clams.Clams;
import creator.ingredients.clams.FreshClams;
import creator.ingredients.dough.Dough;
import creator.ingredients.dough.ThinCrustDough;
import creator.ingredients.pepperoni.Pepperoni;
import creator.ingredients.pepperoni.SlicedPepperoni;
import creator.ingredients.sauce.MarinaraSauce;
import creator.ingredients.sauce.Sauce;
import creator.ingredients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
