package br.edu.unifei.ecoi2205.itabirana.pizzaria.design.pattern.factory;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.info.PizzaSize;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.info.PizzaType;
import br.edu.unifei.ecoi2205.itabirana.pizzaria.info.PizzaIngredients;
public abstract class IPizza {
    private final PizzaType type;
    private final PizzaSize size;
    private final PizzaIngredients ingredients;

    public IPizza(PizzaType type, PizzaSize size, PizzaIngredients ingredients) {
        this.type = type;
        this.size = size;
        this.ingredients = ingredients;
    }
    public String getType() {
        return this.type.toString();
    }
    public PizzaSize getSize() {
        return this.size;
    }
    public PizzaIngredients getIngredients() {
        return this.ingredients;
    }
    public void prepare() {
        System.out.println("Preparing " + this.getType());
        System.out.println("Size is " + this.getSize().toString());
    }
    public void bake() {
        System.out.println("Baking " + this.getType());
    }
    public void cut() {
        System.out.println("Cutting " + this.getType());
    }
    public void box() {
        System.out.println("Boxing " + this.getType());
    }
    public void ingredients() {
        System.out.println("Ingredientes da pizza: " + this.getType()+ " " + this.getIngredients());
    }
}