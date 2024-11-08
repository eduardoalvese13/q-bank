package contas;
import java.time.LocalDate;

public class ContaController {
    private ContaService contaService;

    public ContaController() {
        this.contaService = new ContaService();
    }

    // Create
    public Conta criarConta(int id, String nomeCompleto, String cpf, String endereco, String telefone, String email, LocalDate dataNascimento, double saldoInicial) {
        return contaService.criarConta(id, nomeCompleto, cpf, endereco, telefone, email, dataNascimento, saldoInicial);
    }

    // Update
    public void atualizarConta(int id, String nomeCompleto, String cpf, String endereco, String telefone, String email, LocalDate dataNascimento, double novoSaldo) {
        contaService.atualizarConta(id, nomeCompleto, cpf, endereco, telefone, email, dataNascimento, novoSaldo);
    }
}
