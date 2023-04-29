package totalprice;

import java.time.LocalDate;
import java.util.List;

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

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getAddDate() {
        return addDate;
    }

    public double getTotalPrice(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() <= 75)
                .filter(product -> product.getAddDate().getYear() == LocalDate.now().getYear())
                .mapToDouble(Product::getPrice)
                .sum();
    }
}