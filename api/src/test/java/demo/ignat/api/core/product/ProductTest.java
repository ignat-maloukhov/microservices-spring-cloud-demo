package demo.ignat.api.core.product;

import demo.ignat.api.core.product.dto.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProductTest {

    @Test
    @DisplayName("Valid initialization")
    public void validInitializationTest() {

        int id = 0;
        String name = "John";
        int weight = 100;
        String serviceAddress = "NY";

        Product testProduct = new Product(id, name, weight, serviceAddress);

        assertEquals(id, testProduct.id());
        assertEquals(name, testProduct.name());
        assertEquals(weight, testProduct.weight());
        assertEquals(serviceAddress, testProduct.serviceAddress());
    }

    @Test
    @DisplayName("Valid equals method")
    public void validEqualsTest() {

        int id = 0;
        String name = "John";
        int weight = 100;
        String serviceAddress = "NY";

        Product testProduct = new Product(id, name, weight, serviceAddress);
        boolean result = testProduct.equals(new Product(0, "John", 100, "NY"));

        assertTrue(result);

    }



}