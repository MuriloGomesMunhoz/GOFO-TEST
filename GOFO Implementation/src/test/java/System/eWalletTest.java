package System;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import System.eWallet;

public class eWalletTest {

    private eWallet wallet;

    @BeforeEach
    public void setUp() {
        wallet = new eWallet();
    }

    @Test
    public void testSetBalanceWithInt() {
        wallet.setBalance(100);
        assertEquals(100, wallet.getBalance(), "Setting balance should correctly update the balance");
    }

    @Test
    public void testDeposit() {
        wallet.setBalance(100);
        wallet.deposit(50);
        assertEquals(150, wallet.getBalance(), "Depositing money should correctly increase the balance");
    }

    @Test
    public void testWithdraw() {
        wallet.setBalance(100);
        wallet.withdraw(50);
        assertEquals(50, wallet.getBalance(), "Withdrawing money should correctly decrease the balance");
    }

    @Test
    public void testGetBalance() {
        wallet.setBalance(200);
        assertEquals(200, wallet.getBalance(), "getBalance should return the current balance");
    }

    // Testes adicionais podem ser adicionados aqui, se necessário.
}
