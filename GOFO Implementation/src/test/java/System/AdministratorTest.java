package System;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdministratorTest {
    @Test
    public void verificaObtencaoSenha() {
        Administrator admin = new Administrator();
        assertEquals("admin123", admin.getPassword());
    }

    @Test
    public void verificaObtencaoEmail() {
        Administrator admin = new Administrator();
        assertEquals("admin@hotmail.com", admin.getEmail());
    }


}
