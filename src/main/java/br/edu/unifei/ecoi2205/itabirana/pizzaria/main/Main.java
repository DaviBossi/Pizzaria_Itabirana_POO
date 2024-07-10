package br.edu.unifei.ecoi2205.itabirana.pizzaria.main;

import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.abstractfactory.TraditionalPizzaFactory;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.adapter.ExpressAdapter;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.adapter.IDelivery;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.adapter.IFoodAdapter;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.builder.Order;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.builder.OrderBuilder;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.factory.PizzaCalzone;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.factory.PizzaMargherita;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.factory.PizzaSeafood;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.strategy.CreditCardPayment;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.strategy.MoneyPayment;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.strategy.PixPayment;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.info.Client;

public class Main {
    public static void main(String[] args) {
        TraditionalPizzaFactory pizzaFactory = new TraditionalPizzaFactory();
        Client johnDoe = new Client(100, "John Doe", "", "", "");
        Order order = new OrderBuilder().setClient(johnDoe)
                .addPizza(new PizzaCalzone())
                .addPizza(new PizzaMargherita())
                .addPizza(new PizzaSeafood())
                .build();
        pizzaFactory.createPizza(order);
        IDelivery delivery = new ExpressAdapter();
        delivery.delivery(order);
        PixPayment pixPayment = new PixPayment();
        pixPayment.calculate(order);
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.calculate(order);
        MoneyPayment moneyPayment = new MoneyPayment();
        moneyPayment.calculate(order);
    }
}