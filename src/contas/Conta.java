package contas;
import java.time.LocalDate;

public class Conta {
    private int idf;
    private String nomeCompleto;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private LocalDate dataNascimento;
    private double saldo;

    public Conta(int id, String nomeCompleto, String cpf, String endereco, String telefone, String email, LocalDate dataNascimento, double saldo) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.saldo = saldo;
    }


    // Métodos para get e set publico das variáveis privadas
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{id=" + id + ", nomeCompleto='" + nomeCompleto + "', cpf='" + cpf + "', endereco='" + endereco
                + "', telefone='" + telefone + "', email='" + email + "', dataNascimento=" + dataNascimento
                + ", saldo=" + saldo + '}';
    }
}
