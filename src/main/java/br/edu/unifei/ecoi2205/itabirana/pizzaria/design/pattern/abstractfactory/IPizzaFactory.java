package br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.abstractfactory;

import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.builder.Order;

public interface IPizzaFactory {
    public void createPizza(Order order);
}