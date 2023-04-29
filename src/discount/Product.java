package discount;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Product {

    private String type;
    private double price;
    private boolean discount;

    public Product(String type, double price, boolean discount) {
        this.type = type;
        this.price = price;
        this.discount = discount;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public Product getCheapestBook(List<Product> products) throws Exception {
        Optional<Product> cheapestBook = products.stream()
                .filter(product -> product.getType().equals("Book"))
                .min(Comparator.comparingDouble(Product::getPrice));

        if (cheapestBook.isPresent()) {
            return cheapestBook.get();
        } else {
            throw new Exception("Продукт [категорія: Book] не знайдено");
        }
    }
}