package br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.factory;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.info.PizzaIngredients;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.info.PizzaSize;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.info.PizzaType;

public class PizzaSeafood extends IPizza {
    public PizzaSeafood() {
        super(PizzaType.SEAFOOD, PizzaSize.NORMAL, PizzaIngredients.SEAFOOD);
    }
}