// File: src/t3/GiftShop.java
package t3;

import java.util.ArrayList;
import java.util.List;

/*
 * NEW FEATURE: Gift Shop Module
 * This section implements the gift shop management feature,
 * allowing staff to add, list, and sell merchandise.
 */
public class GiftShop {
    private List<Product> products;

    public GiftShop() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> listProducts() {
        return new ArrayList<>(products);
    }

    public void sellProduct(int productId) {
        for (Product p : products) {
            if (p.getId() == productId) {
                System.out.println("Sold product: " + p.getName());
                products.remove(p);
                return;
            }
        }
        System.out.println("Product ID " + productId + " not found.");
    }
}
