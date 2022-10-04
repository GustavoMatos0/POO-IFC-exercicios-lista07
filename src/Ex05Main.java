
import java.util.Scanner;

public class Ex05Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Ex05Lanchonete teste = new Ex05Lanchonete();
        int verifica = 0, quant = 0, cod = 0;

        do {
            System.out.println(teste.menu());
            do {
                System.out.print("\nCodigo: ");
                cod = in.nextInt();
                if(cod != 100 && cod != 101 && cod != 102 && cod != 103 && cod != 104 && cod != 105){
                    System.out.println("Codigo Invalido!");
                }
            } while (cod != 100 && cod != 101 && cod != 102 && cod != 103 && cod != 104 && cod != 105);
            System.out.print("\nQuantidade: ");
            quant = in.nextInt();
            System.out.println(teste.pedido(cod, quant));
            System.out.println("\n[1] Para Continuar, [2] Para Finalizar");
            verifica = in.nextInt();
        } while (verifica != 2);
        
        System.out.println(teste.finaliza());
        in.close();
    }
}
