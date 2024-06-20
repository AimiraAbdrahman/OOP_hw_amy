package main.java.ru.gb.oseminar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import main.java.ru.gb.oseminar.impl.BottleOfWater;
import main.java.ru.gb.oseminar.impl.HotDrink;
import main.java.ru.gb.oseminar.impl.HotDrinkVendingMachine;
import main.java.ru.gb.oseminar.impl.WaterVendingMachine;
import ru.gb.oseminar.Product;

public class ProductMain {
    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 
        55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 
        5, 1), true, Package.GLASS.getMaterial(), 0.5F);

        Product hotDrink1 = new HotDrink("латте", 5, LocalDate.now());

        Product hotDrink2 = new HotDrink("капучино", 5, LocalDate.now(), 60, 
        TypeOfHotDrink.COFFEE.getLiquid(), 0.5F);

        VendingMachine vm = new WaterVendingMachine();

        VendingMachine vm1 = new HotDrinkVendingMachine();

        //System.out.println(vm.getProducts());
        System.out.println(vm1.getProducts());

        //vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        vm1.addProducts(List.of(hotDrink1, hotDrink2));

        System.out.println(vm1.getProducts());

        vm1.getProduct("латте", 1.0, 60);

        System.out.println(vm1.getProducts());
    }
}
