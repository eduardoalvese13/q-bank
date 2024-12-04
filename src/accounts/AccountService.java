package accounts;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
    private final Map<String, Account> accounts = new HashMap<>();

    public void createAccount(String id, String owner, double initialDeposit) {
        accounts.put(id, AccountFactory.createAccount(id, owner, initialDeposit));
    }

    public Account getAccount(String id) {
        if (!accounts.containsKey(id)) throw new AccountNotFoundException("Account not found: " + id);
        return accounts.get(id);
    }

    public void updateAccount(String id, String newOwner) {
        Account account = getAccount(id);
        account = new Account(account.getId(), newOwner, account.getBalance());
        accounts.put(id, account);
    }

    public void deleteAccount(String id) {
        if (!accounts.containsKey(id)) throw new AccountNotFoundException("Account not found: " + id);
        accounts.remove(id);
    }

    public Collection<Account> getAllAccounts() {
        return accounts.values();
    }

}
