package br.edu.unifei.ecoi2205.itabirana.pizzaria.info;

public enum PizzaSize {
    SMALL,
    NORMAL,
    LARGE;
    @Override
    public String toString() {
        String result;
        switch(this) {
            case SMALL:
                result = "Small";
                break;
            case NORMAL:
                result = "Normal";
                break;
            case LARGE:
                result = "Large";
                break;
            default:
                result = "";
                break;
        }
        return result;
    }
}
