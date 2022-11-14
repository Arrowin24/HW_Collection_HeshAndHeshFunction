package products;

import java.util.*;

public class Recipe {
    private String name;
    private Map<Product, Integer> products = new HashMap<>();
    private double totalPrice;

    public Recipe(String name, Set<Product> products) {
        this.name = name;
        for (Product product : products) {
            addProduct(product);
        }
    }

    private void calculateTotalPrice() {
        double price = 0;
        for (Product product : products.keySet()) {
            price += product.getPrice() * products.get(product);
        }
        totalPrice = price;
    }

    public double getTotalPrice() {
        calculateTotalPrice();
        return totalPrice;
    }

    public void addProduct(Product product) {
        if (!product.isCompleted()) {
            throw new RuntimeException("Товар имеет незаполненные поля. Исправьте это перед добавлением в список!");
        }
        if (products.containsKey(product)) {
            throw new RuntimeException("Вы пытаетесть добавить товар, который уже в списке!");
        } else {
            products.put(product, 1);
        }
    }

    public void addProduct(Product product, int numOfProduct) {
        if (numOfProduct < 1) {
            throw new IllegalArgumentException("Количество продуктов не может быть меньше 1!");
        }
        if (!product.isCompleted()) {
            throw new RuntimeException("Товар имеет незаполненные поля. Исправьте это перед добавлением в список!");
        }
        if (products.containsKey(product) && products.get(product) == numOfProduct) {
            throw new RuntimeException("Вы пытаетесть добавить товар, который уже в списке в том же количестве!");
        } else {
            products.put(product, numOfProduct);
        }
    }

    public String getName() {
        return name;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name) && Objects.equals(products, recipe.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, products, totalPrice);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", products=" + products +
                ", totalPrice=" + getTotalPrice() +
                '}';
    }
}
