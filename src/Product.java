import java.util.List;
import java.util.stream.Collectors;

public class Product {

    private String type;
    private double price;

    public Product(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public List<Product> getBook(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() > 250)
                .collect(Collectors.toList());
    }
}