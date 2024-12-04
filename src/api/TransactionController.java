package api;

import transactions.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping("/transfer")
    public ResponseEntity<String> transfer(
            @RequestParam String fromId,
            @RequestParam String toId,
            @RequestParam double amount) {
        transactionService.transfer(fromId, toId, amount);
        return ResponseEntity.ok("Transfer successful");
    }
}
