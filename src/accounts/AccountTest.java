package accounts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void testAccountCreation() {
        Account account = new Account("1", "John", 1000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void testDeposit() {
        Account account = new Account("1", "John", 1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }
}