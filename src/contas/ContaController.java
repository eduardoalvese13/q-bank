package contas;
public class ContaController {
    private ContaService contaService;

    public ContaController() {
        this.contaService = new ContaService();   }

    // Método para criar uma nova conta no sistema
    public Conta criarConta(int id, String titular, double saldoInicial) {
        return contaService.criarConta(id, titular, saldoInicial);    }

    // Métodos de consulta, atualização e exclusão de conta, tudo pelo id
    
    public Conta consultarConta(int id) {
        return contaService.consultarConta(id);}

    public void atualizarConta(int id, String novoTitular, double novoSaldo) {
        contaService.atualizarConta(id, novoTitular, novoSaldo);
    }

    public void excluirConta(int id) {
        contaService.excluirConta(id);
    }
}
