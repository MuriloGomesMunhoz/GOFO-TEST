package System;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import System.PlaygroundOwner;
import System.Playground;
import System.eWallet;

public class PlaygroundOwnerTest {

    private PlaygroundOwner owner;
    private eWallet wallet;
    private Playground playground;

    @BeforeEach
    public void setUp() {
        owner = new PlaygroundOwner();
        wallet = new eWallet();
        playground = new Playground();
        playground.setName("Playground Test");
        // Assumindo que você tem um construtor padrão
        // Configure playground e wallet conforme necessário
    }

    @Test
    public void testSetAndGetBalance() {
        wallet.setBalance(100);
        owner.setBalance(wallet);
        assertEquals(100, owner.getMyBalance(), "Balance should match the value set in eWallet");
    }

    @Test
    public void testAddPlayground() {
        owner.addPlayground(playground);
        assertTrue(owner.existPlayground(playground.getName()), "Playground should exist after being added");
    }

    @Test
    public void testExistPlayground() {
        owner.addPlayground(playground);
        assertTrue(owner.existPlayground(playground.getName()), "Should return true for existing playground");
        assertFalse(owner.existPlayground("Nonexistent Playground"), "Should return false for non-existing playground");
    }

    @Test
    public void testAddRecieveMsg() {
        String message = "Test Message";
        owner.addRecieveMsg(message);
        // Aqui você precisa refatorar displayRecieveMsg para retornar as mensagens como uma String, ao invés de imprimi-las diretamente
        // Assert the expected output after refactoring
    }

    // Adicione mais testes conforme necessário.

}
