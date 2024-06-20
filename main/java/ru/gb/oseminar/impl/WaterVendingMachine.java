package main.java.ru.gb.oseminar.impl;

import java.util.List;

import main.java.ru.gb.oseminar.VendingMachine;
import ru.gb.oseminar.Product;

public class WaterVendingMachine extends VendingMachine {
    public WaterVendingMachine() {
        super();
    }

    public WaterVendingMachine(List<Product> products) {
        super(products);
    }

    @Override
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }
}
