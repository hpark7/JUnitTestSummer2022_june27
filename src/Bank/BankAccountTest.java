package Bank;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

//    @BeforeEach
//    void setUp() {
//        BankAccount ba = new BankAccount();
//    }

    @Test
    public void testWithdraw(){
        BankAccount ba = new BankAccount(500, -1000);
        ba.withdraw(300);
        assertEquals(200, ba.getBalance());
    }

    @Test
    @DisplayName("Deposit 500 successfully")
    public void testDeposit()
    {
        BankAccount ba = new BankAccount(500, -1000);
        ba.deposit(500);
        assertEquals(1000,ba.getBalance());

    }

    @Test
    @DisplayName("Withdraw will become negative")
    public void testWithdrawWithNegative()
    {
        BankAccount ba = new BankAccount(500,-1000);
        ba.withdraw(800);
        //assertNotEquals(0,ba.getBalance());
        assertEquals(0,ba.getBalance());
    }

    @Test
    @DisplayName("Test Active account")
    public void testActiveAccount()
    {
        BankAccount ba = new BankAccount(500,0);
        assertTrue(ba.isActive());
    }

    @Test
    @DisplayName("Test the holder name")
    public void testHolderName()
    {
        BankAccount ba = new BankAccount(500,0);
        ba.setHolderNamed("Matthew");
        assertNotNull(ba.getHolderNamed());
    }

}