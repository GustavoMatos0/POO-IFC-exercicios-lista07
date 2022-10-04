
import java.text.DecimalFormat;

public class Ex05Lanchonete {

    DecimalFormat df = new DecimalFormat("#,##0.00");

    private int cod[] = new int[6];
    private double preco[] = new double[6];
    private double total;

    public Ex05Lanchonete() {

        this.cod[0] = 100;
        this.preco[0] = 1.2;
        this.cod[1] = 101;
        this.preco[1] = 1.3;
        this.cod[2] = 102;
        this.preco[2] = 1.5;
        this.cod[3] = 103;
        this.preco[3] = 1.2;
        this.cod[4] = 104;
        this.preco[4] = 1.3;
        this.cod[5] = 105;
        this.preco[5] = 1;
    }

    public String menu(){
        StringBuilder sb = new StringBuilder();
        sb.append("---------MENU---------");
        sb.append("\nCachorro Quente 100 R$ 1,20");
        sb.append("\nBauru Simples 101 R$ 1,30");
        sb.append("\nBauru com ovo 102 R$ 1,50");
        sb.append("\nHambúrguer 103 R$ 1,20");
        sb.append("\nCheeseburguer 104 R$ 1,30");
        sb.append("\nRefrigerante 105 R$ 1,00");
        return sb.toString();
    }
    
    public String pedido(int codcliente, int quant) {
        StringBuilder sb = new StringBuilder();
        double totallocal = 0;
        for (int i = 0; i < this.cod.length; i++) {
            if (this.cod[i] == codcliente) {
                totallocal = preco[i] * quant;
            }
        }
        this.total += totallocal;
        switch (codcliente) {
            case 100:
                sb.append(quant);
                sb.append(" Cachorro quente(s)");
                break;
            case 101:
                sb.append(quant);
                sb.append(" Bauro(s) Simples");
                break;
            case 102:
                sb.append(quant);
                sb.append(" Bauro(s) com ovo");
                break;
            case 103:
                sb.append(quant);
                sb.append(" Hambúrguer(s)");
                break;
            case 104:
                sb.append(quant);
                sb.append(" Cheeseburguer(s)");
                break;
            case 105:
                sb.append(quant);
                sb.append(" Refrigerante");
                break;
            default:
                sb.append("Codigo incorreto");
        }
        sb.append("\n").append(df.format(totallocal)).append(" R$");
        return sb.toString();
    }

    public String finaliza(){
        StringBuilder sb =  new StringBuilder();
        sb.append("Total do pedido ").append(df.format(this.total)).append(" R$");
        return sb.toString();
    }
}
