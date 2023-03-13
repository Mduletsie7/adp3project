/**
 * Product.java
 * this is the ProductFactoryTest Java class for Unit Testing
 * @author Mdumisi Kelvin Letsie
 * 11.03.2023
 */

package za.ac.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Product;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
class ProductFactoryTest {

    // Product build Test
    @Test
    public void test() {
        Product product = ProductFactory.createProduct("Samsung Galaxy S21FE 5G", 284.99, "Smart Phones", "Samsung");
        assertNotNull(product);
        System.out.println(product.toString());
    }

    // Product build Failing TEST
    @Test
    public void test_fail() {
        Product product = ProductFactory.createProduct("Samsung Galaxy S21FE 5G", 284.99, "Smart Phones", "");
        assertNotNull(product);
        System.out.println(product.toString());
    }

    // Object Equality Test
    @Test
    public void testCompareProductName() {
        Product product = new Product();
        Product myProduct = ProductFactory.createProduct("Samsung Galaxy S21FE 5G", 284.99, "Smart Phones", "Samsung");
        String productName = myProduct.getProductName().toString();
        assertEquals(productName, "Google Pixel 6A");
    }


    // DISABLING TEST
    @Disabled("TODO: Still need to complete this method code")
    @Test
    public void test_productInTransit() {
    }

    // TIMEOUT TEST
    @Test
    void testTimeOut() {
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(2000);

            System.out.println("I got here!");
        });
    }

    @Test
    public void testObjectIdentity() {
        Product product = new Product();
        Product myProduct1 = ProductFactory.createProduct("Samsung Galaxy S21FE 5G", 284.99, "Smart Phones", "Samsung");
        Product myProduct2 =  myProduct1;
        Product myProduct3 = ProductFactory.createProduct("Iphone 14 Pro", 394.99, "Smart Phones", "Apple");

        if(myProduct1 == myProduct1) {
            System.out.println("Products are identical");
        }
        if(myProduct1 == myProduct2) {
            System.out.println("Products are identical");
        } else {
            System.out.println("Product are not identical");
        }
        if(myProduct1 == myProduct3) {
            System.out.println("Products are identical");
        } else {
            System.out.println("Products are not identical");
        }
    }

}