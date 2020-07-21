package com.designpatterns.factorydesign;

public class FactoryDesign {
    public static void main(String[] args) {
        System.out.println("Main method in Factroy Design");

        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza chicagoPizza = chicagoStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + chicagoPizza.getName() + "\n");
    }
}
