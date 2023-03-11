package za.ac.cput.factory;

import za.ac.cput.domain.Product;
import za.ac.cput.util.Helper;

public class ProductFactory {
    public static Product createProduct(String productName, String productCategory, String productBrand) {
        if (Helper.isNullOrEmpty(productName) || Helper.isNullOrEmpty(productCategory) || Helper.isNullOrEmpty(productBrand)) {
            return null;
        }

        String productId = Helper.generateId();
        boolean inStock = Helper.checkStock();
        Double productPrice = 0.0;

        Product product = new Product.Builder()
                .setProductID(productId)
                .setProductName(productName)
                .setProductPrice(productPrice)
                .setProductCategory(productCategory)
                .setProductBrand(productBrand)
                .setInStock(inStock)
                .build();

        return product;
    }
}
