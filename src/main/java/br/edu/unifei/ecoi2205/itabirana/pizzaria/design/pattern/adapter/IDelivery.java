package br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.adapter;

import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.builder.Order;

public interface IDelivery {
    void delivery(Order order);
}