package com.example.expense.tracker.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void testUser() {
        // Create a User object
        User user = new User("testUser", "testPassword", "test@example.com");

        // Test getters
        assertEquals("testUser", user.getUsername());
        assertEquals("testPassword", user.getPassword());
        assertEquals("test@example.com", user.getEmail());

        // Test setters
        user.setUsername("newUsername");
        user.setPassword("newPassword");
        user.setEmail("new@example.com");

        assertEquals("newUsername", user.getUsername());
        assertEquals("newPassword", user.getPassword());
        assertEquals("new@example.com", user.getEmail());

        // Test getId() and setId()
        user.setId("123456789");
        assertEquals("123456789", user.getId());

        // Test constructors
        User emptyUser = new User();
        assertEquals(null, emptyUser.getUsername());
        assertEquals(null, emptyUser.getPassword());
        assertEquals(null, emptyUser.getEmail());

        User userWithId = new User("userWithId", "password", "user@example.com");
        userWithId.setId("987654321");
        assertEquals("987654321", userWithId.getId());
    }
}
