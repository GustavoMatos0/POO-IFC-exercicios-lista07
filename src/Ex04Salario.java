
import java.text.DecimalFormat;

public class Ex04Salario {

    DecimalFormat df = new DecimalFormat("#,##0.00");

    private double ganho;
    private int hora;
    private double ir;
    private double inss;
    private double sind;
    private double salbruto;
    private double sal;
    private double descontos;

    public Ex04Salario(double ganho, int hora) {
        this.ganho = ganho;
        this.hora = hora;

    }

    public Ex04Salario() {

    }

    public double getSalbruto() {
        return salbruto;
    }

    public void setSalbruto(double salbruto) {
        if (salbruto >= 0) {
            this.salbruto = salbruto;
        }
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        if (sal >= 0) {
            this.sal = sal;
        }
    }

    public double getDescontos() {
        return descontos;
    }

    public void setDescontos(double descontos) {
        if (descontos >= 0) {
            this.descontos = descontos;
        }
    }

    public double getIr() {
        return ir;
    }

    public void setIr(double ir) {
        if (ir >= 0) {
            this.ir = ir;
        }
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        if (inss >= 0) {
            this.inss = inss;
        }
    }

    public double getSind() {
        return sind;
    }

    public void setSind(double sind) {
        if (sind >= 0) {
            this.sind = sind;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0) {
            this.hora = hora;
        }
    }

    public double getGanho() {
        return ganho;
    }

    public void setGanho(double ganho) {
        if (ganho >= 0) {
            this.ganho = ganho;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ex04Salario{");
        sb.append("df=").append(df);
        sb.append(", ganho=").append(ganho);
        sb.append(", hora=").append(hora);
        sb.append(", ir=").append(ir);
        sb.append(", inss=").append(inss);
        sb.append(", sind=").append(sind);
        sb.append(", salbruto=").append(salbruto);
        sb.append(", sal=").append(sal);
        sb.append(", descontos=").append(descontos);
        sb.append('}');
        return sb.toString();
    }

    public String mostraSalario() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ganho por hora = ").append(ganho).append(" R$");
        sb.append("\nHoras trabalhadas = ").append(hora).append(" horas");
        sb.append("\nIR = ").append(df.format(ir)).append(" R$");
        sb.append("\nINSS = ").append(df.format(inss)).append(" R$");
        sb.append("\nSindicato = ").append(df.format(sind)).append(" R$");
        sb.append("\nTotal de descontos = ").append(df.format(descontos)).append(" R$");
        sb.append("\nSálario Bruto = ").append(df.format(salbruto)).append(" R$");
        sb.append("\nSalário Líquido = ").append(df.format(sal)).append(" R$");
        return sb.toString();
    }

    public void salario() {
        this.salbruto = hora * ganho;
        this.ir = salbruto * 0.11;
        this.inss = salbruto * 0.08;
        this.sind = salbruto * 0.05;
        this.descontos = ir + inss + sind;
        this.sal = salbruto - descontos;
    }

}
