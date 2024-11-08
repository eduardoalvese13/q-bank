System.out.pri
import contas.Conta;
import contas.ContaController;

import java.time.LocalDate;
import java.util.Scanner;

public class AppConsole {
    private static ContaController contaController = new ContaController();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean executando = true;

        while (executando) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (opcao) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    atualizarConta();
                    break;
                case 3:
                    consultarConta();
                    break;
                case 4:
                    excluirConta();
                    break;
                case 5:
                    System.out.println("Encerrando o sistema...");
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n=== Sistema de Gerenciamento de Contas ===");
        System.out.println("1. Criar Conta");
        System.out.println("2. Atualizar Conta");
        System.out.println("3. Consultar Conta");
        System.out.println("4. Excluir Conta");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void criarConta() {
        System.out.println("\n--- Criar Conta ---");
        System.out.print("ID da Conta: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome Completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Data de Nascimento (AAAA-MM-DD): ");
        LocalDate dataNascimento = LocalDate.parse(scanner.nextLine());

        System.out.print("Saldo Inicial: ");
        double saldoInicial = scanner.nextDouble();

        Conta conta = contaController.criarConta(id, nomeCompleto, cpf, endereco, telefone, email, dataNascimento, saldoInicial);
        System.out.println("Conta criada com sucesso: " + conta);
    }

    private static void atualizarConta() {
        System.out.println("\n--- Atualizar Conta ---");
        System.out.print("ID da Conta: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome Completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Data de Nascimento (AAAA-MM-DD): ");
        LocalDate dataNascimento = LocalDate.parse(scanner.nextLine());

        System.out.print("Novo Saldo: ");
        double novoSaldo = scanner.nextDouble();

        contaController.atualizarConta(id, nomeCompleto, cpf, endereco, telefone, email, dataNascimento, novoSaldo);
        System.out.println("Conta atualizada com sucesso!");
    }

    private static void consultarConta() {
        System.out.println("\n--- Consultar Conta ---");
        System.out.print("ID da Conta: ");
        int id = scanner.nextInt();

        Conta conta = contaController.consultarConta(id);
        if (conta != null) {
            System.out.println("Dados da Conta: " + conta);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void excluirConta() {
        System.out.println("\n--- Excluir Conta ---");
        System.out.print("ID da Conta: ");
        int id = scanner.nextInt();

        contaController.excluirConta(id);
        System.out.println("Conta excluída com sucesso!");
    }
}
