package main.java.ru.gb.oseminar.impl;

import java.time.LocalDate;

import ru.gb.oseminar.Product;


public class HotDrink extends Product {
    protected int temperature;
    protected String liquidType;
    protected float volume;

    public HotDrink(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.temperature = 60;
        this.liquidType = TypeOfHotDrink.COFFEE.getLiquid();
        this.volume = 1;
    }

    public HotDrink(String name, double price, LocalDate releaseDate, int temperature, string liquidType, float volume) {
        super(name, price, releaseDate);
        this.temperature = temperature;
        this.liquidType = liquidType;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getLiquidType() {
        return liquidType;
    }

    public float getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", temperature=" + temperature +
                ", liquidType='" + liquidType + 
                ", volume='" + volume + '\'' +
                '}';
    }
}
