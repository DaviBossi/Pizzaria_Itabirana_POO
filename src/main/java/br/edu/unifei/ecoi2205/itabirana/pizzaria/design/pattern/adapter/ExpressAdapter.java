package br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.adapter;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.builder.Order;

public class ExpressAdapter implements IDelivery{
    private ExpressService expressService;
    public ExpressAdapter(){expressService = new ExpressService();}
    public void delivery(Order order){expressService.deliver(order);}
}
