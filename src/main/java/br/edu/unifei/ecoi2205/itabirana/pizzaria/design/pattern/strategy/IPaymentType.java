package br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.strategy;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.builder.Order;

public interface IPaymentType {
    public void calculate(Order order);
}
