import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private final ManipuladorDeArquivos manipulador = new ManipuladorDeArquivos();
    private HistoricoCompras historico;

    public void executar() {
        try (Scanner read = new Scanner(System.in)) {
            boolean executando = true;
            while (executando) {
                mostrarOpcoes();
                System.out.print("Escolha uma opcao: ");
                String entrada = read.nextLine().trim();

                int opcao;
                try {
                    opcao = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    System.out.println("Opcao invalida. Digite um numero de 1 a 5.");
                    read.nextLine();
                    continue;
                }

                if (historico == null && opcao != 1 && opcao != 2) {
                    System.out.println("Carregue os dados usando a opcao 1 ou 2 primeiro.");
                    read.nextLine();
                    continue;
                }

                try {
                    switch (opcao) {
                        case 1:
                            historico = manipulador.lerArquivoTexto("dadosTexto.txt");
                            System.out.println("Dados do arquivo texto carregados.");
                            read.nextLine();
                            break;
                        case 2:
                            historico = manipulador.lerArquivoBinario("dadosBinario.bin");
                            System.out.println("Dados do arquivo binario carregados.");
                            read.nextLine();
                            break;
                        case 3:
                            gerarNaTela(read);
                            read.nextLine();
                            break;
                        case 4:
                            gerarArquivoTexto(read);
                            read.nextLine();
                            break;
                        case 5:
                            executando = false;
                            break;
                        default:
                            System.out.println("Opcao invalida. Digite um numero de 1 a 5.");
                    }
                } catch (IOException | ClassNotFoundException e) {
                    System.err.println("Nao foi possivel concluir a operacao: " + e.getMessage());
                }
            }
        }
    }

    public void mostrarOpcoes() {
        System.out.println(this);
    }

    private void gerarNaTela(Scanner read) {
        String cpf = solicitarCpf(read);
        System.out.print(gerarRelatorio(cpf));
    }

    private void gerarArquivoTexto(Scanner read) throws IOException {
        String cpf = solicitarCpf(read);
        String relatorio = gerarRelatorio(cpf);
        manipulador.salvarRelatorioTexto(cpf + ".txt", relatorio);
        System.out.println("Relatorio salvo em " + cpf + ".txt.");
    }

    private String gerarRelatorio(String cpf) {
        return historico.gerarRelatorio(cpf);
    }

    private String solicitarCpf(Scanner read) {
        System.out.print("Digite o CPF do cliente: ");
        return read.nextLine().trim();
    }

    @Override
    public String toString() {
        return "==== Menu ====\n"
                + "1 - Carregar dados do arquivo texto (dadosTexto.txt)\n"
                + "2 - Carregar dados do arquivo binario (dadosBinario.bin)\n"
                + "3 - Gerar relatorio na tela\n"
                + "4 - Salvar relatorio em arquivo texto\n"
                + "5 - Sair";
    }
}
