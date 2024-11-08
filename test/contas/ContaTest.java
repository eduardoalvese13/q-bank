package contas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {
    private ContaController contaController;

    @BeforeEach
    public void setup() {
        contaController = new ContaController();
    }

    @Test
    public void testCriarConta() {
        Conta conta = contaController.criarConta(1, "João", 1000);
        assertNotNull(conta);
        assertEquals("João", conta.getTitular());
        assertEquals(1000, conta.getSaldo());
    }

    @Test
    public void testConsultarConta() {
        contaController.criarConta(1, "Maria", 1500);
        Conta conta = contaController.consultarConta(1);
        assertEquals("Maria", conta.getTitular());
        assertEquals(1500, conta.getSaldo());
    }

    @Test
    public void testAtualizarConta() {
        Conta conta = contaController.criarConta(1, "Carlos", 1000);
        contaController.atualizarConta(1, "Carlos Silva", 2000);
        Conta contaAtualizada = contaController.consultarConta(1);
        assertEquals("Carlos Silva", contaAtualizada.getTitular());
        assertEquals(2000, contaAtualizada.getSaldo());
    }

    @Test
    public void testExcluirConta() {
        contaController.criarConta(1, "Ana", 800);
        contaController.excluirConta(1);
        assertThrows(ContaNotFoundException.class, () -> contaController.consultarConta(1));
    }
}
