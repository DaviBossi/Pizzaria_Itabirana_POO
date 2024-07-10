package br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.strategy;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.builder.Order;

public class PixPayment implements IPaymentType {
    @Override
    public void calculate(Order order) {
        System.out.println("PIX");
        System.out.println("Calculating order: " + order.getOrderNumber());
        double totalPrice = order.getTotalPrice();
        double deliveryPrice = order.getDeliveryPrice();
        double discount = order.getTotalPrice() * 0.1;
        double finalPrice = totalPrice + deliveryPrice - discount;
        System.out.println("Total pizzas..: R$ " + totalPrice);
        System.out.println("Delivery Price: R$ " + deliveryPrice);
        System.out.println("Discount......: R$ " + discount);
        System.out.println("Final Price...: R$ " + finalPrice);
    }
}