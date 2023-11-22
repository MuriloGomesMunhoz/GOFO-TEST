package System;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import System.eWallet;

public class eWalletTest {

    private eWallet wallet;

    @BeforeEach
    public void inicializar() {
        wallet = new eWallet();
    }

    @Test
    public void testeRetirada() {
        wallet.setBalance(50);
        wallet.withdraw(10);
        assertEquals(10, wallet.getBalance(), "O dinheiro deve ser descontado.");
    }

    @Test
    public void testeDefinirSaldoComInteiro() {
        wallet.setBalance(55);
        assertEquals(55, wallet.getBalance(), "O saldo deve ser atualizado corretamente.");
    }

    @Test
    public void testeObterSaldo() {
        wallet.setBalance(100);
        assertEquals(100, wallet.getBalance(), "Deve retornar o saldo atual;");
    }

    @Test
    public void testeDeposito() {
        wallet.setBalance(50);
        wallet.deposit(50);
        assertEquals(100, wallet.getBalance(), "O dinheiro deve ser atualizado corretamente.");
    }






}
