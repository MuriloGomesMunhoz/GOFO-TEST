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
    public void configurarAmbiente() {
        playground.setName("Playground");
        wallet = new eWallet();
        owner = new PlaygroundOwner();
        playground = new Playground();
    }

    @Test
    public void testeExistenciaParquinho() {
        owner.addPlayground(playground);
        assertTrue(owner.existPlayground(playground.getName()), "O retorno validará o Plyground criado.");
        assertFalse(owner.existPlayground("Playground não criado"), "O retorno validará se o Plyground foi criado.");
    }

    @Test
    public void testeAdicionarParquinho() {
        owner.addPlayground(playground);
        assertTrue(owner.existPlayground(playground.getName()), "Playground foi criado.");
    }

    @Test
    public void testeDefinirEObterSaldo() {
        wallet.setBalance(50);
        owner.setBalance(wallet);
        assertEquals(50, owner.getMyBalance(), "O saldo deve está igual ao valor definido na Carteira");
    }

    @Test
    public void testeAdicionarReceberMensagem() {
        String message = "Teste Playground";
        owner.addRecieveMsg(message);

    }



}
