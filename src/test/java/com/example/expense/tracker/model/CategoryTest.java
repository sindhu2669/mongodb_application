package com.example.expense.tracker.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CategoryTest {

    @Test
    void testConstructorAndGetters() {
        // Arrange
        String categoryName = "Food";

        // Act
        Category category = new Category(categoryName);

        // Assert
        assertNotNull(category);
        assertEquals(categoryName, category.getName());
    }
}
