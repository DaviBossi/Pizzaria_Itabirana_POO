package br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.abstractfactory;

import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.builder.Order;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.factory.*;

public class TraditionalPizzaFactory implements IPizzaFactory {
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public void createPizza(Order order) {
        IPizza pizza = null;
        for (IPizza pizzaType : order.getPizzas()) {
            if (pizzaType instanceof PizzaCalzone) {
                pizza = new PizzaCalzone();
            } else if (pizzaType instanceof PizzaMargherita) {
                pizza = new PizzaMargherita();
            } else if (pizzaType instanceof PizzaCapricciosa) {
                pizza = new PizzaCapricciosa();
            } else if (pizzaType instanceof PizzaVegan) {
                pizza = new PizzaVegan();
            } else if (pizzaType instanceof PizzaSeafood) {
                pizza = new PizzaSeafood();
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            pizza.ingredients();
        }
    }
}

