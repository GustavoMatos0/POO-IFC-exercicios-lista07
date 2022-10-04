
import java.text.DecimalFormat;

public class Ex10bombaCombustivel {

    DecimalFormat df = new DecimalFormat("#,##0.00");
    private String tipoCombustivel;
    private double valorLitroG;
    private double valorLitroD;
    private double quantG;
    private double quantD;

    public Ex10bombaCombustivel(String tipoCombustivel, double valor, double quant) {
        if (tipoCombustivel.equals("gasolina")) {
            this.tipoCombustivel = tipoCombustivel;
            this.valorLitroG = valor;
            this.quantG = quant;
        }
        if (tipoCombustivel.equals("diesel")) {
            this.tipoCombustivel = tipoCombustivel;
            this.valorLitroD = valor;
            this.quantD = quant;
        }
    }

    public Ex10bombaCombustivel(String tipoCombustivel, double valor) {
        if (tipoCombustivel.equals("gasolina")) {
            this.valorLitroG = valor;
            this.tipoCombustivel = tipoCombustivel;
        }
        if (tipoCombustivel.equals("diesel")) {
            this.valorLitroD = valor;
            this.tipoCombustivel = tipoCombustivel;
        }
    }

    public Ex10bombaCombustivel(String tipoCombustivel) {
        if (tipoCombustivel.equals("gasolina") || (tipoCombustivel.equals("diesel"))) {
            this.tipoCombustivel = tipoCombustivel;
        }
    }

    public Ex10bombaCombustivel() {

    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorLitroG() {
        return valorLitroG;
    }

    public void setValorLitroG(double valorLitroG) {
        this.valorLitroG = valorLitroG;
    }

    public double getValorLitroD() {
        return valorLitroD;
    }

    public void setValorLitroD(double valorLitroD) {
        this.valorLitroD = valorLitroD;
    }

    public double getQuantG() {
        return quantG;
    }

    public void setQuantG(double quantG) {
        this.quantG = quantG;
    }

    public double getQuantD() {
        return quantD;
    }

    public void setQuantD(double quantD) {
        this.quantD = quantD;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ex10bombaCombustivel{");
        sb.append("tipoCombustivel=").append(tipoCombustivel);
        sb.append(", valorLitroG=").append(valorLitroG);
        sb.append(", valorLitroD=").append(valorLitroD);
        sb.append(", quantG=").append(quantG);
        sb.append(", quantD=").append(quantD);
        sb.append('}');
        return sb.toString();
    }

    public void setCombustivel(String tipoCombustivel, double valor, double quant) {
        if (tipoCombustivel.equals("gasolina")) {
            this.tipoCombustivel = tipoCombustivel;
            this.valorLitroG = valor;
            this.quantG = quant;
        }
        if (tipoCombustivel.equals("diesel")) {
            this.tipoCombustivel = tipoCombustivel;
            this.valorLitroD = valor;
            this.quantD = quant;
        }
    }

    public String abastacePorValor(double valor) {
        StringBuilder sb = new StringBuilder();
        if (valor > 0) {
            if (this.tipoCombustivel.equals("gasolina")) {
                double litros = valor / this.valorLitroG;
                this.setQuantG(this.getQuantG() - litros);
                sb.append(litros).append(" litros abastecidos de ").append(this.tipoCombustivel);
            }

            if (this.tipoCombustivel.equals("diesel")) {
                double litros = valor / this.valorLitroD;
                this.setQuantD(this.getQuantD() - litros);
                sb.append(litros).append(" litros abastecidos de ").append(this.tipoCombustivel);
            }
        } else {
            sb.append("Valor Invalido!");
        }
        return sb.toString();
    }

    public String abastecerPorLitro(double litros) {
        StringBuilder sb = new StringBuilder();
        if (litros > 0) {
            if (this.tipoCombustivel.equals("gasolina")) {
                double valor = litros * this.valorLitroG;
                this.setQuantG(this.getQuantG() - litros);
                sb.append(valor).append(" R$ ").append(this.tipoCombustivel);
            }

            if (this.tipoCombustivel.equals("diesel")) {
                double valor = litros * this.valorLitroD;
                this.setQuantD(this.getQuantD() - litros);
                sb.append(df.format(valor)).append(" R$").append(this.tipoCombustivel);
            }
        } else {
            sb.append("Valor em Litros Invalido!");
        }
        return sb.toString();
    }

    public void alteraValor(double valor) {
        if (valor > 0) {
            if (this.tipoCombustivel.equals("gasolina")) {
                this.valorLitroG = valor;
            }
            if (this.tipoCombustivel.equals("diesel")) {
                this.valorLitroD = valor;
            }
        }
    }

    public void alteraCombustivel() {
        if (this.tipoCombustivel.equals("gasolina")) {
            this.tipoCombustivel = "diesel";
        }
        if (this.tipoCombustivel.equals("diesel")) {
            this.tipoCombustivel = "gasolina";
        }
    }

    public void abastacerBomba(float litro) {
        if (litro > 0) {
            if (this.tipoCombustivel.equals("gasolina")) {
                this.setQuantG(this.getQuantG() + litro);
            }
            if (this.tipoCombustivel.equals("diesel")) {
                this.setQuantD(this.getQuantD() + litro);
            }
        }
    }
}
