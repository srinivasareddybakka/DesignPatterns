package com.designpatterns.factorydesign;

public class ClamPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
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
