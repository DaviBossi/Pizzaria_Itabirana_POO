package br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.adapter;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.builder.Order;

public class IFoodAdapter implements IDelivery {
    private IFoodService iFoodService;
    public IFoodAdapter() {
        iFoodService = new IFoodService();
    }
    @Override
    public void delivery(Order order) {
        iFoodService.deliver(order);
    }
}
