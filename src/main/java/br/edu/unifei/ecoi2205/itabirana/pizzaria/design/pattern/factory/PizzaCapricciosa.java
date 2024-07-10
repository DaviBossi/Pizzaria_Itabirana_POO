package br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.factory;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.info.PizzaIngredients;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.info.PizzaSize;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.info.PizzaType;

public class PizzaCapricciosa extends IPizza {
    public PizzaCapricciosa() {
        super(PizzaType.CAPRICCIOSA, PizzaSize.NORMAL, PizzaIngredients.CAPRICCIOSA);
    }
}