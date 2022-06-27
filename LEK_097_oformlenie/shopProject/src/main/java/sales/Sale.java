package sales;

import product.Product;
import users.User;

import java.time.LocalDateTime;
import java.util.UUID;

public class Sale {
    private final UUID id;
    private final Product product;
    private final User user;
    private final double totalCost;
    private final Integer totalAmountBought;
    private final LocalDateTime purchaseDate;

    public Sale(Product product, User user, double totalCost, Integer totalAmountBought, LocalDateTime purchaseDate) {
        this.id = UUID.randomUUID();
        this.product = product;
        this.user = user;
        this.totalCost = totalCost;
        this.totalAmountBought = totalAmountBought;
        this.purchaseDate = purchaseDate;
    }

    public UUID getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public Integer getTotalAmountBought() {
        return totalAmountBought;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", product=" + product.getName() +
                ", user=" + user.getUsername() +
                ", totalCost=" + totalCost +
                ", totalAmountBought=" + totalAmountBought +
                ", purchaseDate=" + purchaseDate;
    }
}
