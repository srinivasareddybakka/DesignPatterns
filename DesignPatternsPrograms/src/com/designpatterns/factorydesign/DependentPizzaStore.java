package com.designpatterns.factorydesign;

public class DependentPizzaStore {


    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("NY")) {
            if (type.equals("cheese")) {
                pizza = new NYStyleCheesePizza();
            } else if (type.equals("clam")) {
                pizza = new NyStyleClamPizza();

            } else if (type.equals("veggi")) {
                pizza = new NYStyleVeggiPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new NYstylePepperoniPizza();
            }
        } else if (style.equals("Chicago")) {
            if (type.equals("cheese")) {
                pizza = new ChicagoStyleCheesePizza();
            } else if (type.equals("veggi")) {
                pizza = new ChicagoStyleVeggiPizza();
            } else if (type.equals("clam")) {
                pizza = new ChicagoStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new ChicagoStylePepperoniPizza();
            }
        } else {
            System.out.println("Error : Invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }

}
