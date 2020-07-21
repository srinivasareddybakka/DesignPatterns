package com.designpatterns.factorydesign;

public class VeggiePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println(" Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sause = pizzaIngredientFactory.createSauce();
        clam = pizzaIngredientFactory.createClam();
        sause = pizzaIngredientFactory.createSauce();


    }
}
