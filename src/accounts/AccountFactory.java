package accounts;

public class AccountFactory {
    public static Account createAccount(String id, String owner, double initialDeposit) {
        return new Account(id, owner, initialDeposit);
    }
}
