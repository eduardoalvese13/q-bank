package contas;
import java.util.HashMap;
import java.util.Map;

public class ContaRepository {
    private Map<Integer, Conta> contas = new HashMap<>();

    public void salvarConta(Conta conta) {
        contas.put(conta.getId(), conta);   }

    public Conta buscarContaPorId(int id) {
        return contas.get(id);}

   
    public void atualizarConta(Conta conta) {
        contas.put(conta.getId(), conta);
    }

    public void deletarConta(int id) {
        contas.remove(id);
    }
}
