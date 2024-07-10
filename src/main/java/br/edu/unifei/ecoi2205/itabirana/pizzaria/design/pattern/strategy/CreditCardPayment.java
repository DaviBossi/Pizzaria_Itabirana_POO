package br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.strategy;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.builder.Order;

public class CreditCardPayment implements IPaymentType {
    @Override
    public void calculate(Order order) {
        System.out.println("CREDIT CARD");
        System.out.println("Calculating order: " + order.getOrderNumber());
        double totalPrice = order.getTotalPrice();
        double deliveryPrice = order.getDeliveryPrice();
        double taxe = order.getTotalPrice() * 0.03;
        double finalPrice = totalPrice + deliveryPrice + taxe;
        System.out.println("Total pizzas..: R$ " + totalPrice);
        System.out.println("Delivery Price: R$ " + deliveryPrice);
        System.out.println("Machine taxe..: R$ " + taxe);
        System.out.println("Final Price...: R$ " + finalPrice);
    }
}
