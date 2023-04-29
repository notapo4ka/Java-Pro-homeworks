package sorting;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Product {

    private int id;
    private String type;
    private double price;
    private boolean discount;
    private java.time.LocalDate addDate;

    public Product(int id, String type, double price, boolean discount, LocalDate addDate) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.addDate = addDate;
    }

    public String getType() {
        return type;
    }

    public Map<String, List<Product>> groupProduct(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }
}