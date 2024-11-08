package contas;

import java.util.HashMap;
import java.util.Map;

public class ContaService {
    private ContaRepository contaRepository;

    public ContaService() {
        this.contaRepository = new ContaRepository();
    }

    // Criação de conta
    public Conta criarConta(int id, String titular, double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo");
        }
        Conta novaConta = new Conta(id, titular, saldoInicial);
        contaRepository.salvarConta(novaConta);
        return novaConta;
    }

    public Conta consultarConta(int id) {
        Conta conta = contaRepository.buscarContaPorId(id);
        if (conta == null) {
            throw new ContaNotFoundException("Conta com ID " + id + " não encontrada");
        }
        return conta;
    }

    // Atualização de conta
    public void atualizarConta(int id, String novoTitular, double novoSaldo) {
        Conta conta = contaRepository.buscarContaPorId(id);
        if (conta == null) {
            throw new ContaNotFoundException("Conta com ID " + id + " não encontrada");
        }
        conta.setTitular(novoTitular);
        conta.setSaldo(novoSaldo);
        contaRepository.atualizarConta(conta);
    }

    // Exclusão de conta
    public void excluirConta(int id) {
        Conta conta = contaRepository.buscarContaPorId(id);
        if (conta == null) {
            throw new ContaNotFoundException("Conta com ID " + id + " não encontrada");
        }
        contaRepository.deletarConta(id);
    }
}
