
public class Ex06Quadrado {

    private double lado;

    public Ex06Quadrado(double lado) {
        this.lado = lado;
    }

    public Ex06Quadrado() {

    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado >= 0) {
            this.lado = lado;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ex06Quadrado{");
        sb.append("lado=").append(lado);
        sb.append('}');
        return sb.toString();
    }

    public String calc() {
        StringBuilder sb = new StringBuilder();
        double quadrado = lado * lado;
        sb.append("Area do Quadrado: ").append(quadrado);
        return sb.toString();
    }

}
