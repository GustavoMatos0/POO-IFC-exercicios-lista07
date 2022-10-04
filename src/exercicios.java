
public class exercicios {

    public static void main(String[] args) {
        Ex10bombaCombustivel teste = new Ex10bombaCombustivel("gasolina", 3.4, 95.4);
        teste.setCombustivel("diesel", 2.6, 100.32);
        System.out.println(teste.abastacePorValor(52));
        teste.alteraCombustivel();
        System.out.println(teste.abastecerPorLitro(10));
        teste.alteraValor(5.5);
        System.out.println(teste.toString());
    }

}
