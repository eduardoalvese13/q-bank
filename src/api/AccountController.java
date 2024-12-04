package api;

import accounts.Account;
import accounts.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping
    public ResponseEntity<String> createAccount(@RequestBody Account account) {
        accountService.createAccount(account.getId(), account.getOwner(), account.getBalance());
        return ResponseEntity.ok("Account created successfully");
    }

    @GetMapping
    public ResponseEntity<Collection<Account>> getAllAccounts() {
        return ResponseEntity.ok(accountService.getAllAccounts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccount(@PathVariable String id) {
        return ResponseEntity.ok(accountService.getAccount(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateAccount(@PathVariable String id, @RequestBody String newOwner) {
        accountService.updateAccount(id, newOwner);
        return ResponseEntity.ok("Account updated successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAccount(@PathVariable String id) {
        accountService.deleteAccount(id);
        return ResponseEntity.ok("Account deleted successfully");
    }
}
