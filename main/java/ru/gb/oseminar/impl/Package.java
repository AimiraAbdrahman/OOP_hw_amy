package main.java.ru.gb.oseminar.impl;

public enum Package {
    PLASTIC("пластик"), GLASS("стекло"), POLYETILEN("Полиэтилен");

    private final String material;

    private Package(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }    
}
