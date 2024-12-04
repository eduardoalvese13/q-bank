package main;

import accounts.AccountService;
import transactions.TransactionService;

public class BankAPI {
    private final AccountService accountService = new AccountService();
    private final TransactionService transactionService = new TransactionService(accountService);

    public static void main(String[] args) {
        var api = new BankAPI();
        api.accountService.createAccount("1", "John", 1000);
        api.accountService.createAccount("2", "Doe", 500);

        api.transactionService.transfer("1", "2", 200);
        System.out.println("Transfer completed");
    }
}
