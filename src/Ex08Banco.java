
public class Ex08Banco {

    private int numConta;
    private String nome;
    private float saldo;

    public Ex08Banco(int numConta, String nome, float saldo) {
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = saldo;

    }

    public Ex08Banco(int numConta, String nome) {
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = 0;
    }

    public Ex08Banco() {

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ex08Banco{");
        sb.append("numConta=").append(numConta);
        sb.append(", nome=").append(nome);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    public void deposito(float valor) {
        if (valor > 0) {
            this.setSaldo(this.getSaldo() + valor);
        }
    }

    public void saque(float valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.setSaldo(this.getSaldo() - valor);
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

}
