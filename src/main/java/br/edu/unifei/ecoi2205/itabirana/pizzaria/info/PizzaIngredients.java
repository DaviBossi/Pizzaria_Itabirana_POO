package br.edu.unifei.ecoi2205.itabirana.pizzaria.info;

public enum PizzaIngredients {
    CALZONE ("(MUSSARELA ,PRESUNTO, TOMATE, ORÉGANO)"),
    MARGHERITA ("(MOLHO DE TOMATE , MUSSARELA, MANJERICÃO FRESCO, AZEITE DE OLIVA)"),
    CAPRICCIOSA ("(MOLHO DE TOMATE, MUSSARELA, PRESUNTO COZIDO , COGUMELOS, AZEITONAS PRETAS, ALCACHOFRAS, OREGANO, AZEITE DE OLIVA)"),
    SEAFOOD ("(MOLHO DE TOMATE, MUSSARELA, FRUTOS DO MAR, ALHO, AZEITE DE OLIVA, ORÉGANO)"),
    VEGAN ("(MOLHO DE TOMATE, MUSSARELA VEGANA, MAJERICAO FRESCO, AZEITE DE OLIVA)");

    private final String ingredients;

    PizzaIngredients(String ingredients){
        this.ingredients = ingredients;
    }
    public String getIngredients(){
        return ingredients;
    }
    public String toString() {
        switch (this){
            case CALZONE:
                return CALZONE.ingredients;
            case SEAFOOD:
                return SEAFOOD.ingredients;
            case MARGHERITA:
                return MARGHERITA.ingredients;
            case CAPRICCIOSA:
                return CAPRICCIOSA.ingredients;
            case VEGAN:
                return VEGAN.ingredients;
        }
        return "SABOR NAO ENCONTRADO";
    }
}
