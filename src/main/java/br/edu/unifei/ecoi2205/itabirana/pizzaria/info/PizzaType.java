package br.edu.unifei.ecoi2205.itabirana.pizzaria.info;

public enum PizzaType {
    MARGHERITA (15, 30, 45),
    CAPRICCIOSA (20, 35, 50),
    VEGAN (25, 40, 55),
    SEAFOOD (35, 50, 65),
    CALZONE (15, 30, 40);
    private final double smallPrice, normalPrice, largePrice;
    PizzaType(double smallPrice, double normalPrice, double largePrice) {
        this.smallPrice = smallPrice;
        this.normalPrice = normalPrice;
        this.largePrice = largePrice;
    }
    public double getPrice(PizzaSize size) {
        switch (size) {
            case SMALL: return smallPrice;
            case NORMAL: return normalPrice;
            case LARGE: return largePrice;
            default: return 0;
        }
    }
    @Override
    public String toString() {
        switch (this) {
            case MARGHERITA:
                return "Margherita";
            case CAPRICCIOSA:
                return "Capricciosa";
            case VEGAN:
                return "Vegetariana";
            case SEAFOOD:
                return "Seafood";
            case CALZONE:
                return "Calzone";
            default:
                return "Unknown";
        }
    }
}