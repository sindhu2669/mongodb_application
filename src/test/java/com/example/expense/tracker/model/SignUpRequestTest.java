package com.example.expense.tracker.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SignUpRequestTest {

    @Test
    public void testSignUpRequest() {
        SignUpRequest request = new SignUpRequest();
        request.setUsername("testUser");
        request.setPassword("testPassword");
        request.setEmail("test@example.com");

        assertEquals("testUser", request.getUsername());
        assertEquals("testPassword", request.getPassword());
        assertEquals("test@example.com", request.getEmail());

        // Test toString() method
        String expectedToString = "SignUpRequest(username=testUser, password=testPassword, email=test@example.com)";
        assertEquals(expectedToString, request.toString());

        // Test equals() method
        SignUpRequest sameRequest = new SignUpRequest();
        sameRequest.setUsername("testUser");
        sameRequest.setPassword("testPassword");
        sameRequest.setEmail("test@example.com");
        assertEquals(request, sameRequest);

        // Test hashCode() method
        assertEquals(request.hashCode(), sameRequest.hashCode());
    }
}
