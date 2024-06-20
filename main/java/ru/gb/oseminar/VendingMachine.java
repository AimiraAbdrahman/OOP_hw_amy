package main.java.ru.gb.oseminar;
import java.util.ArrayList;
import java.util.List;

import ru.gb.oseminar.Product;

public abstract class VendingMachine {
    protected List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public void addProducts (List<Product> products) {
        this.products.addAll(products);
    }

    public Product getProduct(String name) {

//        products.stream().filter(product -> product.getName().equals(name)).findFirst().orElse(null);

        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                return product;
            }
        }
        // throw new RuntimeException("No such product: " + name);
        System.out.println("No such product: " + name);
        return null;
    }

    /**
     * Метод getProduct для класса HotDrink
     * @param name
     * @param volume
     * @param temperature
     * @return
     */
    public Product getProduct(String name, float volume, int temperature) {
        for (Product product : products) {
            if (product.getName().equals(name) && product.getVolume() == volume && product.getTemperature() == temperature) {
                products.remove(product);
                return product;
            }
        }
        // throw new RuntimeException("No such product: " + name);
        System.out.println("No such product: " + name);
        return null;
    }

//    public Product getProduct(String name) {
//
//        for (Product product : products) {
//            if (product.getName().equals(name)) {
//                products.remove(product);
//                return product;
//            }
//        }
//
//        throw new RuntimeException("No such product: " + name);
//    }

    public List<Product> getProducts() {
        return products;
    }
}
