package System;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import System.Player;

public class PlayerTest {

    private Player player;

    @BeforeEach
    public void prepararAmbiente() {
        player = new Player();
    }

    @Test
    public void testeDefinirEObterSaldo() {
        player.setBalance(50);
        assertEquals(50, player.getBalance(), "O saldo deve ser alterado.");
    }

    @Test
    public void testeAdicionarEVisualizarCaixaDeEntrada() {
        player.addInbox("Teste para Caixa de entrada.");
    }
}
