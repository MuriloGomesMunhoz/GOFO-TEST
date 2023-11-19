package System;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import System.Administrator;
import java.util.ArrayList;

public class AdministratorTest {

    @Test
    public void testGetEmail() {
        Administrator admin = new Administrator();
        assertEquals("admin@gmail.com", admin.getEmail());
    }

    @Test
    public void testGetPassword() {
        Administrator admin = new Administrator();
        assertEquals("123", admin.getPassword());
    }


    // Este teste pode ser ampliado para cobrir mais funcionalidades.
}
