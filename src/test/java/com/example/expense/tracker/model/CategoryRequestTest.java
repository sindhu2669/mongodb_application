package com.example.expense.tracker.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CategoryRequestTest {

    @Test
    public void testNoArgsConstructor() {
        CategoryRequest categoryRequest = new CategoryRequest();
        // Verify that the object is not null
        assertEquals(null, categoryRequest.getName());
    }

    @Test
    public void testAllArgsConstructor() {
        CategoryRequest categoryRequest = new CategoryRequest("Test Name");
        // Verify that the name is set correctly
        assertEquals("Test Name", categoryRequest.getName());
    }

    @Test
    public void testSetName() {
        CategoryRequest categoryRequest = new CategoryRequest();
        categoryRequest.setName("New Name");
        // Verify that the name is set correctly
        assertEquals("New Name", categoryRequest.getName());
    }

    @Test
    public void testGetName() {
        CategoryRequest categoryRequest = new CategoryRequest("Test Name");
        // Verify that the correct name is returned
        assertEquals("Test Name", categoryRequest.getName());
    }
}
