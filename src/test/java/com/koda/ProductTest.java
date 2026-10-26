package com.koda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class ProductTest {
    @Test
    public void constructorInjectsCategoryDependency() {
        Category category = new Category("Elektrik");

        Product product = new Product("Keyboard", category);

        assertEquals("Keyboard", product.getProductName());
        assertSame(category, product.getCategory());
        assertEquals("Elektrik", product.getCategory().getCategoryName());
    }
}
