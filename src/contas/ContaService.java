package contas;

import java.time.LocalDate;

public class ContaService {
    private ContaRepository contaRepository;

    public ContaService() {
        this.contaRepository = new ContaRepository();
    }


    public Conta criarConta(int id, String nomeCompleto, String cpf, String endereco, String telefone, String email, LocalDate dataNascimento, double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo");
        }
        Conta novaConta = new Conta(id, nomeCompleto, cpf, endereco, telefone, email, dataNascimento, saldoInicial);
        contaRepository.salvarConta(novaConta);
        return novaConta;
    }


    
    public void atualizarConta(int id, String nomeCompleto, String cpf, String endereco, String telefone, String email, LocalDate dataNascimento, double novoSaldo) {
        Conta conta = contaRepository.buscarContaPorId(id);
        if (conta == null) {
            throw new ContaNotFoundException("Conta com ID " + id + " não encontrada");
        }
        conta.setNomeCompleto(nomeCompleto);
        conta.setCpf(cpf);
        conta.setEndereco(endereco);
        conta.setTelefone(telefone);
        conta.setEmail(email);
        conta.setDataNascimento(dataNascimento);
        conta.setSaldo(novoSaldo);
        contaRepository.atualizarConta(conta);
    }
}
