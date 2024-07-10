package br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.builder;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.factory.*;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.info.Client;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.info.PizzaType;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.info.PizzaSize;
import java.util.ArrayList;
public class Order {
    private int number;
    private Client client;
    private ArrayList<IPizza> pizzas;
    private double deliveryPrice;
    private double discount;
    public Order() {
// Empty constructor
        this.number = (int) (Math.random() * 1000);
    }
    public int getOrderNumber() {
        return this.number;
    }
    public Client getClient() {
        return this.client;
    }
    public ArrayList<IPizza> getPizzas() {
        return this.pizzas;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public void addPizza(IPizza pizza) {
        if (pizzas == null) {
            pizzas = new ArrayList<IPizza>();
        }
        pizzas.add(pizza);
    }
    public double getTotalPrice() {
        double totalPrice = 0;
        for (IPizza pizza : pizzas) {
            if (pizza instanceof PizzaCalzone) {
                totalPrice += PizzaType.CALZONE.getPrice(pizza.getSize());
            } else if (pizza instanceof PizzaMargherita) {
                totalPrice += PizzaType.MARGHERITA.getPrice(pizza.getSize());
            } else if (pizza instanceof PizzaCapricciosa) {
                totalPrice += PizzaType.CAPRICCIOSA.getPrice(pizza.getSize());
            } else if (pizza instanceof PizzaVegan) {
                totalPrice += PizzaType.VEGAN.getPrice(pizza.getSize());
            } else if (pizza instanceof PizzaSeafood) {
                totalPrice += PizzaType.SEAFOOD.getPrice(pizza.getSize());
            }
        }
        return totalPrice;
    }
    public double getDeliveryPrice() {
        return this.deliveryPrice;
    }
    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
