package main.java.ru.gb.oseminar.impl;

public enum TypeOfHotDrink {
    COFFEE("кофе"), TEA("чай");

    private final String liquid;

    private TypeOfHotDrink(String liquid) {
        this.liquid = liquid;
    }

    public String getLiquid() {
        return liquid;
    }    
}
