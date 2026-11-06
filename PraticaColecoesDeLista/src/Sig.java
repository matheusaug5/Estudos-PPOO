import java.util.Scanner;

public class Sig {
    private Scanner scanner;

    public Sig(){
        scanner = new Scanner(System.in)
    }

    public void executar(){
        return exibirMenu();
    }

    private void exibirMenu(){
        System.err.println("### MENU ### \n
        1. Cadastrar disciplina\n
        2. Cadastrar dados de aluno em disciplina\n
        3. Mostrar diario de disciplina\n
        4. Sair\n
        Escolha uma opcao:");
        
    }

    private void executarOpcao(int x){
        x = scanner.nextInt();

            switch (x) {
                case 1:
                    System.err.println("Digite o codigo da Disciplina: ");
                    String codigo = scanner.nextLine();
                    Disciplina disciplina = new Disciplina(codigo);
                    break;
                case 2:
                    System.err.println("Digite os dados do Aluno");
                    String nome = scanner.nextLine();
                    int nota = scanner.nextInt();
                    int faltas = scanner.nextInt();
                    disciplina.adicionarAluno(new Aluno(nome, nota, faltas));
                default:
                    break;
            }
    }
}
