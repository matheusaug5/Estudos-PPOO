import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Codigo");
        int codigo = entrada.nextInt();

        System.out.println("Quantidade");
        int quantidade = entrada.nextInt();

        Produto produto = new Produto(codigo, quantidade);

        System.out.printf("Preco Unitario: %.2f\n", produto.precoUnitario());
        System.out.printf("Valor Bruto: %.2f\n", produto.calcularValorBruto());
        System.out.printf("Desconto: %.2f\n", produto.calcularDesconto());
        System.out.printf("Valor Final: %.2f\n", produto.calcularValorFinal());

        entrada.close();
    }
}
