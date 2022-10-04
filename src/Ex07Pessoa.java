
public class Ex07Pessoa {

    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Ex07Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public Ex07Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ex07Pessoa{");
        sb.append("nome=").append(nome);
        sb.append(", idade=").append(idade);
        sb.append(", peso=").append(peso);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }

    public void envelhecer(int anos) {
        int cont = 0;
        int idade;
        if (this.getIdade() < 21) {
            for (int i = 0; i < anos; i++) {
                this.setAltura(this.getAltura() + 0.05);
                this.setIdade(this.getIdade() + 1);
                cont++;
                if (this.getIdade() == 21) {
                    break;
                }
            }
            this.setIdade(this.getIdade() + (anos - cont));
        } else {
            this.setIdade(this.getIdade() + anos);
        }
    }

    public void engordar(double kilos) {
        this.setPeso(this.getPeso() + kilos);
    }

    public void emagrecer(double kilos) {
        this.setPeso(this.getPeso() - kilos);
    }

    public void crescer(double cen) {
        this.setAltura(this.getAltura() + cen);
    }
}
