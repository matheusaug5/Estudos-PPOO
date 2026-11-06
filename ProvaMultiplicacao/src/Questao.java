import java.util.Random;

public class Questao {

    private int idQuestao;
    private String enunciado;
    private int gabarito;

    private static int ultimaQuestao = 0;

    public Questao() {
        Random numeroAleatorio = new Random();

        ultimaQuestao++;
        idQuestao = ultimaQuestao;

        int num1 = numeroAleatorio.nextInt(10);
        int num2 = numeroAleatorio.nextInt(10);

        enunciado = "Quanto é " + num1 + " * " + num2 + "?";
        gabarito = num1 * num2;
    }

    public int getIdQuestao() {
        return idQuestao;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public boolean verificarResposta(int resposta) {
        return resposta == gabarito;
    }
}