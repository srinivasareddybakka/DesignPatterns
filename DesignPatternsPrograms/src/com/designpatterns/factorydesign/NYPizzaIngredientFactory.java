package com.designpatterns.factorydesign;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrushDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSause();
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
        return new SlicePepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
