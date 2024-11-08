package contas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {
    private ContaController contaController;

    @BeforeEach
    public void setup() {
        contaController = new ContaController();
    }

    @Test
    public void testCriarConta() {
        Conta conta = contaController.criarConta(1, "João Silva", "123.456.789-00", "Rua A, 123", "(31) 98765-4321", "joao@email.com", LocalDate.of(1990, 1, 1), 1000.0);
        assertNotNull(conta);
        assertEquals("João Silva", conta.getNomeCompleto());
        assertEquals("123.456.789-00", conta.getCpf());
        assertEquals("Rua A, 123", conta.getEndereco());
        assertEquals("(31) 98765-4321", conta.getTelefone());
        assertEquals("joao@email.com", conta.getEmail());
        assertEquals(LocalDate.of(1990, 1, 1), conta.getDataNascimento());
        assertEquals(1000.0, conta.getSaldo());
    }

    @Test
    public void testAtualizarConta() {
        Conta conta = contaController.criarConta(1, "Maria Silva", "987.654.321-00", "Rua B, 456", "(31) 91234-5678", "maria@email.com", LocalDate.of(1985, 5, 15), 1500.0);
        contaController.atualizarConta(1, "Maria Souza", "987.654.321-00", "Rua C, 789", "(31) 98765-4321", "maria_souza@email.com", LocalDate.of(1985, 5, 15), 2000.0);

        Conta contaAtualizada = contaController.consultarConta(1);
        assertEquals("Maria Souza", contaAtualizada.getNomeCompleto());
        assertEquals("Rua C, 789", contaAtualizada.getEndereco());
        assertEquals(2000.0, contaAtualizada.getSaldo());
    }
}
