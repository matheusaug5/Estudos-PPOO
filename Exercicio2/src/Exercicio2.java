import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Enter the initial guess:");
        double valorRaiz = entrada.nextDouble();

        NewtonRaphson newtonRaphson = new NewtonRaphson(valorRaiz);

        system.out.printf("Valor Raiz: %.15f\n", newtonRaphson.calcularRaiz());
        entrada.close();
    }
}
