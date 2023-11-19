package System;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import System.userProfile;

public class UserProfileTest {

    private userProfile user;

    @BeforeEach
    public void setUp() {
        user = new userProfile();
    }

    @Test
    public void testSetAndGetFullName() {
        user.setFName("John");
        user.setLName("Doe");
        assertEquals("John Doe", user.getFullName(), "Full name should be 'John Doe'");
    }

    @Test
    public void testSetAndGetID() {
        user.setID(12345);
        assertEquals(12345, user.getID(), "ID should be 12345");
    }

    @Test
    public void testSetAndGetEmail() {
        user.setEmail("john.doe@example.com");
        assertEquals("john.doe@example.com", user.getEmail(), "Email should match the set value");
    }

    @Test
    public void testSetAndGetPassword() {
        user.setPassword("password123");
        assertEquals("password123", user.getPassword(), "Password should match the set value");
    }

    @Test
    public void testSetAndGetPhone() {
        user.setPhone(1234567890);
        assertEquals(1234567890, user.getPhone(), "Phone number should match the set value");
    }

    @Test
    public void testSetAndGetLocation() {
        user.setLocation("New York");
        assertEquals("New York", user.getLocation(), "Location should match the set value");
    }

    @Test
    public void testSetAndGetRule() {
        user.setRule("Admin");
        assertEquals("Admin", user.getRule(), "Rule should match the set value");
    }

    // Testes adicionais para outros métodos, como setPayment, podem ser adicionados aqui.

}
