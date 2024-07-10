package br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.factory;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.info.PizzaIngredients;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.info.PizzaSize;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.info.PizzaType;

public class PizzaCalzone extends IPizza {
    public PizzaCalzone() {
        super(PizzaType.CALZONE, PizzaSize.NORMAL, PizzaIngredients.CALZONE);
    }
}
