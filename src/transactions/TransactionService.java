package transactions;

import accounts.AccountService;

public class TransactionService {
    private final AccountService accountService;

    public TransactionService(AccountService accountService) {
        this.accountService = accountService;
    }

    public void transfer(String fromId, String toId, double amount) {
        var fromAccount = accountService.getAccount(fromId);
        var toAccount = accountService.getAccount(toId);

        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }
}
