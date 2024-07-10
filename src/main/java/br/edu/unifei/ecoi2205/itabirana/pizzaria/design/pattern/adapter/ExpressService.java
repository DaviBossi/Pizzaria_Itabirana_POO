package br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.adapter;

import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.builder.Order;

public class ExpressService {
    public ExpressService() {System.out.println("Express Service Delivery");}
    public void deliver(Order order){
        System.out.println("Delivering Order: " + order.getOrderNumber());
        order.setDeliveryPrice(15);
    }
}
