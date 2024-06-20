package main.java.ru.gb.oseminar.impl;
import java.time.LocalDate;

import ru.gb.oseminar.Product;

public class BottleOfWater extends Product {

    public float volume;
    public String pack;
    public boolean isSpark;

    public BottleOfWater(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.isSpark = false;
        this.volume = 1;
        this.pack = Package.PLASTIC.getMaterial();
    }

    public BottleOfWater(String name, double price, LocalDate releaseDate, boolean spark, String pack, float volume) {
        super(name, price, releaseDate);
        this.isSpark = false;
        this.volume = volume;
        this.pack = pack;
    }

    public float getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    public boolean isSpark() {
        return isSpark;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                "volume=" + volume +
                ", pack='" + pack + '\'' +
                ", isSpark=" + isSpark +
                '}';
    }
}