package System;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import System.Player;

public class PlayerTest {

    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player();
    }

    @Test
    public void testSetAndGetBalance() {
        player.setBalance(100);
        assertEquals(100, player.getBalance(), "Balance should be correctly set and retrieved");
    }

    @Test
    public void testAddAndViewInbox() {
        player.addInbox("Test message");
        // Simulate viewInbox output and assert the expected result
        // Nota: Isso pode requerer refatoração na classe Player para permitir testar facilmente
        // Por exemplo, retornar os valores de Inbox como String ao invés de imprimir diretamente no console.
    }

    // Adicionar mais testes para outros métodos conforme necessário.

}
