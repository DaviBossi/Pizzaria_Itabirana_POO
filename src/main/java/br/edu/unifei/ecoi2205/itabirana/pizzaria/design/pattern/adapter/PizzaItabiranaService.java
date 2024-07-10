package br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.adapter;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.builder.Order;

public class PizzaItabiranaService {
    public PizzaItabiranaService() {
        System.out.println("PizzaItabiranaService Delivery");
    }
    public void deliver(Order order) {
        System.out.println("Delivering order: " + order.getOrderNumber());
        order.setDeliveryPrice(5);
    }
}
