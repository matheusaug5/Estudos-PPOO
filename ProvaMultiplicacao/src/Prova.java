import java.util.Scanner;

public class Prova {

    private Questao[] questoes;
    private Correcao[] correcoes;

    public Prova() {

        questoes = new Questao[5];
        correcoes = new Correcao[5];

        for (int i = 0; i < questoes.length; i++) {
            questoes[i] = new Questao();
        }
    }

    public void aplicar() {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questoes.length; i++) {

            Questao questao = questoes[i];

            System.out.println();
            System.out.println("Questão " + questao.getIdQuestao());
            System.out.println(questao.getEnunciado());

            int tentativas = 1;

            System.out.print("Resposta: ");
            int resposta = scanner.nextInt();

            if (questao.verificarResposta(resposta)) {

                System.out.println("Muito bem, você acertou!");

                System.out.println(
                    "Você tentou " +
                    tentativas +
                    " vez(es) e acertou a questão."
                );

                correcoes[i] = new Correcao(
                    questao.getIdQuestao(),
                    "acertou",
                    tentativas
                );

            } else {

                System.out.println("Infelizmente você errou!");

                System.out.println(
                    "Você ganhou mais uma chance! " +
                    "Digite outra resposta para a questão: "
                );

                tentativas++;

                resposta = scanner.nextInt();

                if (questao.verificarResposta(resposta)) {

                    System.out.println("Muito bem, você acertou!");

                    System.out.println(
                        "Você tentou " +
                        tentativas +
                        " vez(es) e acertou a questão."
                    );

                    correcoes[i] = new Correcao(
                        questao.getIdQuestao(),
                        "acertou",
                        tentativas
                    );

                } else {

                    System.out.println("Infelizmente você errou!");

                    System.out.println(
                        "Você tentou 2 vezes e errou a questão."
                    );

                    correcoes[i] = new Correcao(
                        questao.getIdQuestao(),
                        "errou",
                        tentativas
                    );
                }
            }
        }
    }

    public void gerarRelatorio() {

        System.out.println();
        System.out.println("RELATÓRIO DA PROVA");
        System.out.println();

        System.out.printf(
            "%-10s %-15s %-20s%n",
            "Questão",
            "Situação",
            "Número de Tentativas"
        );

        for (int i = 0; i < correcoes.length; i++) {

            Correcao correcao = correcoes[i];

            System.out.printf(
                "%-10d %-15s %-20d%n",
                correcao.getNumeroQuestao(),
                correcao.getSituacao(),
                correcao.getNumeroTentativa()
            );
        }
    }
}