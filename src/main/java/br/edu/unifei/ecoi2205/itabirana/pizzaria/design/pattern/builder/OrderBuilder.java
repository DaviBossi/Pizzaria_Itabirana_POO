package br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.builder;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.factory.IPizza;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.info.Client;

public class OrderBuilder {
    private Order order = new Order();
    public OrderBuilder addPizza(IPizza pizza) {
        order.addPizza(pizza);
        return this;
    }
    public OrderBuilder setClient(Client client) {
        order.setClient(client);
        return this;
    }
    public Order build() {
        return order;
    }
}