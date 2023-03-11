package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Product;

import static org.junit.jupiter.api.Assertions.*;
class ProductFactoryTest {

    @Test
    public void test() {
        Product product = ProductFactory.createProduct("Samsung Galaxy S21FE 5G", 284.99, "Smart Phones", "Samsung");
        assertNotNull(product);
        System.out.println(product.toString());
    }

    @Test
    public void test_fail() {
        Product product = ProductFactory.createProduct("Samsung Galaxy S21FE 5G", 284.99, "Smart Phones", "");
        assertNotNull(product);
        System.out.println(product.toString());
    }
}