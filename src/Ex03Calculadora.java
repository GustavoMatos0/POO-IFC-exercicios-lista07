
public class Ex03Calculadora {

    private double n1;
    private double n2;

    public Ex03Calculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Ex03Calculadora() {

    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double soma() {
        return n1 + n2;
    }

    public double sub() {
        return n1 - n2;
    }

    public double mul() {
        return n1 * n2;
    }

    public double div() {
        return n1 / n2;
    }
}
