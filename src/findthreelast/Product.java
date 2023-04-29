package findthreelast;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Product {

    private String type;
    private double price;
    private boolean discount;
    private java.time.LocalDate addDate;

    public Product(String type, double price, boolean discount, LocalDate addDate) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.addDate = addDate;
    }

    public LocalDate getAddDate() {
        return addDate;
    }

    public List<Product> getLastThreeProduct(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getAddDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}