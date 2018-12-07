package creator.ingredientFactories;


import creator.ingredients.cheese.Cheese;
import creator.ingredients.cheese.MozzarellaCheese;
import creator.ingredients.clams.Clams;
import creator.ingredients.clams.FrozenClams;
import creator.ingredients.dough.Dough;
import creator.ingredients.dough.ThickCrustDough;
import creator.ingredients.pepperoni.Pepperoni;
import creator.ingredients.pepperoni.SlicedPepperoni;
import creator.ingredients.sauce.PlumTomatoSauce;
import creator.ingredients.sauce.Sauce;
import creator.ingredients.veggies.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
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
        return new FrozenClams();
    }
}
