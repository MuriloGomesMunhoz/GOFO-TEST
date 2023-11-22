package System;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import System.userProfile;

public class UserProfileTest {

    private userProfile user;

    @BeforeEach
    public void configurar() {
        user = new userProfile();
    }
    @Test
    public void testSetAndGetLocation() {
        user.setLocation("São Bernado do campo ");
        assertEquals("São Bernado do campo", user.getLocation(), "Localização deve ser igual a definida");
    }
    @Test
    public void testeDefinirEObterNomeCompleto() {
        user.setFName("Murilo");
        user.setLName("Munhoz");
        assertEquals("Murilo Munhoz", user.getFullName(), "O nome completo deve ser Murilo Munhoz");
    }

    @Test
    public void testSetAndGetID() {
        user.setID(12345);
        assertEquals(12345, user.getID(), "ID do usuário deve ser 12345");
    }

    @Test
    public void testSetAndGetEmail() {
        user.setEmail("murilo.munhoz@hotmail.com");
        assertEquals("murilo.munhoz@hotmail.com", user.getEmail(), "Email deve ser igual ao defenido");
    }
    @Test
    public void testSetAndGetRule() {
        user.setRule("Admin");
        assertEquals("Admin", user.getRule(), "O regra deve ser igual a definida");
    }
    @Test
    public void testeDefinirEObterSenha() {
        user.setPassword("murilo123");
        assertEquals("murilo123", user.getPassword(), "A senha deve ser igual a definida");
    }

    @Test
    public void testeDefinirEObterTelefone() {
        user.setPhone(1234567890);
        assertEquals(1234567890, user.getPhone(), "O telefone deve ser igual ao definido");
    }






}
