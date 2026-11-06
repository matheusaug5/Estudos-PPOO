import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a frase: ");
        String texto = entrada.nextLine();

        Frase frase = new Frase(texto);

        String resultado = frase.encontrarPalavraComMaisVogais();
        System.out.println("palavra com mais vogais: " + resultado);
        System.out.println("quantidade de vogais: " + frase.contarVogais(frase.encontrarPalavraComMaisVogais()));
        entrada.close();
    }
}
