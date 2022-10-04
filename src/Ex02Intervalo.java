
public class Ex02Intervalo {
//intervalo entre dois numeros

    private int n1;
    private int n2;

    public Ex02Intervalo(int n1, int n2) {
        if (n1 > n2) {
            this.n1 = n2;
            this.n2 = n1;
        } else {
            this.n1 = n1;
            this.n2 = n2;
        }
    }

    public Ex02Intervalo() {

    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public String intervalo() {
        StringBuilder sb = new StringBuilder();
        for (int i = n1; i < n2; i += 2) {
            sb.append(i);
            sb.append(" ");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ex02{");
        sb.append("n1=").append(n1);
        sb.append(", n2=").append(n2);
        sb.append('}');
        return sb.toString();
    }

}
