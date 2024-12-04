package payments;

import accounts.Account;

public class PaymentService {
    public void pay(Account account, double amount) {
        account.withdraw(amount);
    }
}
