package br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.adapter;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.builder.Order;

public class PizzariaItabiranaAdapter implements IDelivery {
    private PizzaItabiranaService pizzaItabiranaService;
    public PizzariaItabiranaAdapter() {
        this.pizzaItabiranaService = new PizzaItabiranaService();
    }
    @Override
    public void delivery(Order order) {
        pizzaItabiranaService.deliver(order);
    }
}